package api;

import api.handler.HomeHandler;
import api.handler.LoginHandler;
import api.handler.AboutHandler;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.ServletHandler;
import org.mortbay.log.Logger;
import org.mortbay.log.StdErrLog;


public class JettyServer {

    private static final Logger logger = new StdErrLog("JettyServer.class");

     public static void main (String[] args) throws Exception {

         // create an instance of the Jetty server
         final Server server = new Server(8080);
         ServletHandler handler = new ServletHandler();

         handler.addServletWithMapping(LoginHandler.class, "/login");
         handler.addServletWithMapping(HomeHandler.class, "/home");
         handler.addServletWithMapping(AboutHandler.class, "/about");
         server.setHandler(handler);


         server.start();
         logger.info("Server is now listening on port: 8080",null,null);
         server.join();
     }
}
