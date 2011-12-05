package be.j4s.playground.helloLtwAspect.servlet;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.WebApplicationContext;

@WebListener
public class SpringContextLoaderListenerWithServlet3Annotation extends org.springframework.web.context.ContextLoaderListener {

	private static final Logger LOG = LoggerFactory.getLogger(SpringContextLoaderListenerWithServlet3Annotation.class);

	@Override
	public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
		LOG.info("in initWebApplicationContext");
		LOG.info(this.getClass().getClassLoader().toString());
		return super.initWebApplicationContext(servletContext);
	}

}