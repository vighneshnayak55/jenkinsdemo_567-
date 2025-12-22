package jenkinsdemo.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

   static Logger log= LoggerFactory.getLogger(JenkinsdemoApplication.class);

   @PostConstruct
    public void init(){
        log.info("Init Application");

    }
	public static void main(String[] args) {
        log.info("application started");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
