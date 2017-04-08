package cn.xpf.main;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/2.
 */
@RestController
@SpringBootApplication
@ComponentScan("cn.xpf")
public class ApplicationMain {

//    @RequestMapping("/")
//    public String greeting() {
//        return "Hello World!";
//    }
    public static void main(String[] args) {
        System.setProperty("spring.devtools.restart.enabled", "true");
        SpringApplication app  = new SpringApplication(ApplicationMain.class);
		app.setBannerMode(Banner.Mode.OFF);
        app.run(args);


    }
}
