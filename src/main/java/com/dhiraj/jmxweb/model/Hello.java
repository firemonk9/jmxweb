package com.dhiraj.jmxweb.model;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created with IntelliJ IDEA.
 * User: firemonk9
 * Date: 12/22/12
 * Time: 1:17 PM
 * To change this template use File | Settings | File Templates.
 */


public class Hello {


    public void myInit() throws Exception{


    }

    public void Hello(){

//                try {
//            System.out.println("this is cool ... strting");
//            System.out.println(" getting started... ");
//            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
//
//            // Construct the ObjectName for the MBean we will register
//            ObjectName name = null;
//
//
//
//            // Create the Hello World MBean
//            HelloMBean hello = this;
//
//            //StandardMBean mbean = new StandardMBean(hello, HelloMBean.class);
//
//            name = new ObjectName("com.dhiraj.jmxexample:type=test1");
//            // Register the Hello World MBean
//            mbs.registerMBean(hello, name);
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }

    }

    public void sayHello() {
        System.out.println("hello, world");
    }

    public int add(int x, int y) {
        return x + y;
    }

    /* Getter for the Name attribute.  The pattern shown here is
       frequent: the getter returns a private field representing the
       attribute value.  In our case, the attribute value never
       changes, but for other attributes it might change as the
       application runs.  Consider an attribute representing
       statistics such as uptime or memory usage, for example.  Being
       read-only just means that it can't be changed through the
       management interface.  */
    public String getName() {
        return this.name;
    }

    /* Getter for the CacheSize attribute.  The pattern shown here is
       frequent: the getter returns a private field representing the
       attribute value, and the setter changes that field.  */
    public int getCacheSize() {
        return this.cacheSize;
    }

    /* Setter for the CacheSize attribute.  To avoid problems with
       stale values in multithreaded situations, it is a good idea
       for setters to be synchronized.  */
    public synchronized void setCacheSize(int size) {
        this.cacheSize = size;

	/* In a real application, changing the attribute would
	   typically have effects beyond just modifying the cacheSize
	   field.  For example, resizing the cache might mean
	   discarding entries or allocating new ones.  The logic for
	   these effects would be here.  */
        System.out.println("Cache size now " + this.cacheSize);
    }

    private final String name = "Reginald";
    private int cacheSize = DEFAULT_CACHE_SIZE;
    private static final int DEFAULT_CACHE_SIZE = 200;
}
