package com.demo.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

@RestController
public class HomeController {

    @GetMapping(value="/", produces=MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> home() {
        String html = "<!DOCTYPE html><html><head><title>ClickNBuy</title>"
            + "<style>"
            + "body{font-family:Arial,sans-serif;margin:0;padding:0;background:#f3f4f6;}"
            + ".navbar{background:#4F46E5;padding:1rem 2rem;color:white;display:flex;justify-content:space-between;align-items:center;}"
            + ".navbar h1{margin:0;font-size:1.5rem;}"
            + ".hero{text-align:center;padding:80px 20px;background:linear-gradient(135deg,#4F46E5,#7C3AED);color:white;}"
            + ".hero h2{font-size:2.5rem;margin-bottom:1rem;}"
            + ".hero p{font-size:1.2rem;opacity:0.9;}"
            + ".badge{display:inline-block;background:#10B981;color:white;padding:10px 24px;border-radius:25px;font-weight:bold;margin-top:20px;}"
            + ".cards{display:flex;justify-content:center;gap:20px;padding:40px 20px;flex-wrap:wrap;}"
            + ".card{background:white;border-radius:12px;padding:24px;width:200px;text-align:center;box-shadow:0 4px 6px rgba(0,0,0,0.1);}"
            + ".card h3{color:#4F46E5;margin-top:0;}"
            + ".card p{color:#666;font-size:0.9rem;}"
            + ".pipeline{background:white;margin:20px;border-radius:12px;padding:24px;box-shadow:0 4px 6px rgba(0,0,0,0.1);}"
            + ".pipeline h3{color:#4F46E5;}"
            + ".steps{display:flex;justify-content:center;gap:10px;flex-wrap:wrap;}"
            + ".step{background:#EEF2FF;color:#4F46E5;padding:8px 16px;border-radius:20px;font-size:0.85rem;font-weight:bold;}"
            + ".footer{text-align:center;padding:20px;color:#666;font-size:0.9rem;}"
            + "</style></head>"
            + "<body>"
            + "<nav class='navbar'><h1>ClickNBuy</h1><span>DevSecOps Demo</span></nav>"
            + "<div class='hero'>"
            + "<h2>Welcome to ClickNBuy!</h2>"
            + "<p>Your one-stop shop for amazing products</p>"
            + "<div class='badge'>Live on Kubernetes</div>"
            + "</div>"
            + "<div class='cards'>"
            + "<div class='card'><h3>Pipeline</h3><p>GitHub Actions CI/CD fully automated</p></div>"
            + "<div class='card'><h3>Security</h3><p>SonarQube + Trivy scanning</p></div>"
            + "<div class='card'><h3>Deployed</h3><p>Running on k3s Kubernetes</p></div>"
            + "<div class='card'><h3>Monitored</h3><p>Prometheus + Grafana metrics</p></div>"
            + "</div>"
            + "<div class='pipeline'>"
            + "<h3>DevSecOps Pipeline</h3>"
            + "<div class='steps'>"
            + "<span class='step'>Code Push</span>"
            + "<span class='step'>SonarQube</span>"
            + "<span class='step'>Build JAR</span>"
            + "<span class='step'>Docker Build</span>"
            + "<span class='step'>Trivy Scan</span>"
            + "<span class='step'>Push Image</span>"
            + "<span class='step'>Deploy K8s</span>"
            + "<span class='step'>Monitor</span>"
            + "</div>"
            + "</div>"
            + "<div class='footer'>ClickNBuy &copy; 2025 | Built with Spring Boot + Docker + Kubernetes</div>"
            + "</body></html>";
        return ResponseEntity.ok(html);
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\":\"UP\"}";
    }
}
