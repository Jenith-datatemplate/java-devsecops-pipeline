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
            + "body{margin:0;padding:0;font-family:'Segoe UI',sans-serif;background:#0B0B0C;color:#E5E5E5;}"
            
            + ".navbar{background:rgba(20,20,20,0.9);backdrop-filter:blur(10px);padding:1rem 2rem;display:flex;justify-content:space-between;align-items:center;border-bottom:1px solid rgba(255,255,255,0.1);}"
            + ".navbar h1{margin:0;font-size:1.6rem;color:#D4AF37;letter-spacing:1px;}"
            + ".navbar span{color:#aaa;font-size:0.9rem;}"

            + ".hero{text-align:center;padding:100px 20px;background:radial-gradient(circle at top,#1a1a1a,#0B0B0C);}"
            + ".hero h2{font-size:2.8rem;margin-bottom:1rem;color:white;}"
            + ".hero p{font-size:1.2rem;color:#aaa;}"
            + ".badge{display:inline-block;margin-top:25px;padding:10px 28px;border-radius:30px;background:linear-gradient(135deg,#D4AF37,#b8962e);color:black;font-weight:bold;box-shadow:0 4px 20px rgba(212,175,55,0.4);}"

            + ".cards{display:flex;justify-content:center;gap:25px;padding:50px 20px;flex-wrap:wrap;}"
            + ".card{background:rgba(255,255,255,0.05);border-radius:16px;padding:25px;width:220px;text-align:center;backdrop-filter:blur(10px);border:1px solid rgba(255,255,255,0.1);transition:all 0.3s ease;}"
            + ".card:hover{transform:translateY(-8px);box-shadow:0 10px 30px rgba(0,0,0,0.5);}"
            + ".card h3{color:#D4AF37;margin-top:0;}"
            + ".card p{color:#aaa;font-size:0.9rem;}"

            + ".pipeline{background:rgba(255,255,255,0.05);margin:30px;border-radius:16px;padding:30px;border:1px solid rgba(255,255,255,0.1);backdrop-filter:blur(10px);}"
            + ".pipeline h3{text-align:center;color:#D4AF37;margin-bottom:20px;}"

            + ".steps{display:flex;justify-content:center;gap:12px;flex-wrap:wrap;}"
            + ".step{background:#111;border:1px solid rgba(212,175,55,0.3);color:#D4AF37;padding:10px 18px;border-radius:20px;font-size:0.85rem;font-weight:bold;transition:0.3s;}"
            + ".step:hover{background:#D4AF37;color:black;}"

            + ".footer{text-align:center;padding:25px;color:#777;font-size:0.85rem;border-top:1px solid rgba(255,255,255,0.1);margin-top:40px;}"

            + "</style></head>"

            + "<body>"
            + "<nav class='navbar'><h1>ClickNBuyyyy</h1><span>DevSecOps Demo</span></nav>"

            + "<div class='hero'>"
            + "<h2>Luxury Shopping Experience</h2>"
            + "<p>Engineered with precision. Delivered with elegance.</p>"
            + "<div class='badge'>Running on Kubernetes</div>"
            + "</div>"

            + "<div class='cards'>"
            + "<div class='card'><h3>Pipeline</h3><p>Fully automated CI/CD using GitHub Actions</p></div>"
            + "<div class='card'><h3>Security</h3><p>Advanced scanning with SonarQube & Trivy</p></div>"
            + "<div class='card'><h3>Deployment</h3><p>Powered by lightweight k3s Kubernetes</p></div>"
            + "<div class='card'><h3>Monitoring</h3><p>Real-time metrics via Prometheus & Grafana</p></div>"
            + "</div>"

            + "<div class='pipeline'>"
            + "<h3>DevSecOps Pipeline</h3>"
            + "<div class='steps'>"
            + "<span class='step'>Code Push</span>"
            + "<span class='step'>Scan</span>"
            + "<span class='step'>Build</span>"
            + "<span class='step'>Dockerize</span>"
            + "<span class='step'>Security Check</span>"
            + "<span class='step'>Push</span>"
            + "<span class='step'>Deploy</span>"
            + "<span class='step'>Monitor</span>"
            + "</div>"
            + "</div>"

            + "<div class='footer'>ClickNBuy © 2025 | Premium DevSecOps Platform</div>"
            + "</body></html>";

        return ResponseEntity.ok(html);
    }

    @GetMapping("/health")
    public String health() {
        return "{\"status\":\"UP\"}";
    }
}
