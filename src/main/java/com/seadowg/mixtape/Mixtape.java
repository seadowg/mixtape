package com.seadowg.mixtape;

import static spark.Spark.*;
import spark.*;

public class Mixtape {
  public static void main(String[] args) {
    externalStaticFileLocation("/var/www/public");

    get(new Route("/") {
      @Override
      public Object handle(Request request, Response response) {
        return "Hello World";
      }
    });
  }
}
