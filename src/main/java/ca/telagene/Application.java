package ca.telagene;

import ca.telagene.jersey.JerseyApplication;

public class Application {

   public static void main(String[] args) {

      Thread jettyRestApiThread = new Thread(new JerseyApplication(), "Jersey-Jetty-REST-API");
      jettyRestApiThread.start();

   }
}
