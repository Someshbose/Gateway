package somesh.github.io.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import lombok.extern.slf4j.Slf4j;

/**
 * Gateway application main class.
 * 
 * @author sombose
 *
 */
@Slf4j
@EnableZuulProxy
@SpringBootApplication
@SuppressWarnings("HideUtilityClassConstructor")
public class GatewayApplication {

  /**
   * main method.
   * 
   * @param args String[]
   */
  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class, args);
    log.info("Gateway Application is started.");
  }
}
