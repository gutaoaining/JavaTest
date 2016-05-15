package Socket.server;

import java.util.HashMap;
import java.util.Map;

public class ServletContext {
	// 对应具体的servlet子类,如login对应着loginServlet
	private Map<String, Servlet> servlet;
	// url或者请求路径对应的servlet名称的映射，如/login对应着login
	private Map<String, String> mapping;

	public ServletContext(){
		servlet = new HashMap<String, Servlet>();
		mapping = new HashMap<String, String>();
	}
	public Map<String, Servlet> getServlet() {
		return servlet;
	}

	public void setServlet(Map<String, Servlet> servlet) {
		this.servlet = servlet;
	}

	public Map<String, String> getMapping() {
		return mapping;
	}

	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}

}
