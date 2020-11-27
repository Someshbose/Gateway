package somesh.github.io.Gateway.filters.error;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ErrorFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return FilterConstants.ERROR_TYPE;
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    log.error("Inside Route Filter");

    return null;
  }
}
