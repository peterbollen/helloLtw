package be.j4s.playground.helloLtwAspect.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "EchoServlet", urlPatterns = { "/echo" })
public class EchoServlet extends HttpServlet {

	private static final Logger LOG = LoggerFactory.getLogger(EchoServlet.class);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOG.info("in EchoServlet.doGet(HttpServletRequest, HttpServletResponse)");
		LOG.info("this.getClass().getClassLoader(): " + this.getClass().getClassLoader().toString());
	}

}
