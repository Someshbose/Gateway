package somesh.github.io.Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import somesh.github.io.Gateway.filters.error.ErrorFilter;
import somesh.github.io.Gateway.filters.post.PostFilter;
import somesh.github.io.Gateway.filters.pre.PreFilter;
import somesh.github.io.Gateway.filters.route.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
	@Bean
  public PreFilter preFilter() {
      return new PreFilter();
  }
  @Bean
  public PostFilter postFilter() {
      return new PostFilter();
  }
  @Bean
  public ErrorFilter errorFilter() {
      return new ErrorFilter();
  }
  @Bean
  public RouteFilter routeFilter() {
      return new RouteFilter();
  }

}
