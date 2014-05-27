package com.seadowg.mixtape;

import static spark.Spark.*;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.StringWriter;
import java.io.IOException;
import java.lang.RuntimeException;


public class Mixtape {
  public static void main(String[] args) {
    externalStaticFileLocation("/var/www/public");

    get("/", (req, res) -> {
      MustacheFactory mustacheFactory = new DefaultMustacheFactory("templates");
      Mustache mustache = mustacheFactory.compile("index.mustache");
      StringWriter stringWriter = new StringWriter();

      try {
        mustache.execute(stringWriter, null).close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }

      return stringWriter.toString();
    });
  }
}
