package com.dhiraj.jmxweb.servlet;

import com.dhiraj.jmxweb.model.Hello;
import com.dhiraj.jmxweb.model.HelloMBean;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Created with IntelliJ IDEA.
 * User: firemonk9
 * Date: 12/22/12
 * Time: 1:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyInit extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void init(){

        System.out.println("this is cool ... strting");
        System.out.println(" getting started... ");
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // Construct the ObjectName for the MBean we will register
        ObjectName name = null;
        try {


            // Create the Hello World MBean
            HelloMBean hello = new Hello();

            //StandardMBean mbean = new StandardMBean(hello, HelloMBean.class);

            name = new ObjectName("com.dhiraj.jmxexample:type=test1");
            // Register the Hello World MBean
            mbs.registerMBean(hello, name);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

}
