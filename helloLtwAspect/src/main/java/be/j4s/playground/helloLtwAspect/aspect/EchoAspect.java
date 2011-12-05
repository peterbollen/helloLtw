package be.j4s.playground.helloLtwAspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class EchoAspect {

	private static final Logger LOG = LoggerFactory.getLogger(EchoAspect.class);

	@Pointcut("execution(* be.j4s.playground.helloLtwAspect.servlet.*.doGet(..))")
	public void simple() {
	}

	@Before("simple()")
	public void process(JoinPoint jp) {
		LOG.error("$$$$$$$$$$$$$$$$$$$$$$$ money time $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
}
