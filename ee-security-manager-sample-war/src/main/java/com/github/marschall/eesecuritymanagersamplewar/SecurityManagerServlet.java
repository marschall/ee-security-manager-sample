package com.github.marschall.eesecuritymanagersamplewar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityManagerServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain");
    response.setCharacterEncoding("US-ASCII");
    PrintWriter writer = response.getWriter();

    writer.println(System.getSecurityManager());
    writer.println();


    String javaVersion = System.getProperty("java.version");
    writer.print("- ");
    writer.println(javaVersion);

    // will throw exception
//    Properties properties = System.getProperties();
//    for (Object key : properties.keySet()) {
//      writer.print("- ");
//      writer.println(key);
//    }


  }

}
