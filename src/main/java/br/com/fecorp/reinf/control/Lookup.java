package br.com.fecorp.reinf.control;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.sql.DataSource;


public class Lookup {
	
	public static void main(String[] args)throws Exception{
		
		final Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		properties.put(Context.PROVIDER_URL, "http-remoting://127.0.0.1:8080");
		properties.put(Context.SECURITY_CREDENTIALS, "${postgres}");
		properties.put(Context.SECURITY_CREDENTIALS, "${fecorp}");

		final Context context = new InitialContext(properties);
		final DataSource ds = (DataSource) context.lookup("java:jboss/datasource/ReinfDS");
		final NamingEnumeration<NameClassPair> namings = context.list("java:jboss/datasource/ReinfDS");
		if (namings.hasMoreElements()) {
		    final NameClassPair name = namings.next();
		    System.out.println(name.getName() + " | " + name.getClassName());
		}
  }
}

