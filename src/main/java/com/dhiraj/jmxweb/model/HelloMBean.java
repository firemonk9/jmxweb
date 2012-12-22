package com.dhiraj.jmxweb.model;

/**
 * Created with IntelliJ IDEA.
 * User: firemonk9
 * Date: 12/22/12
 * Time: 1:18 PM
 * To change this template use File | Settings | File Templates.
 */
public interface HelloMBean {
    public void sayHello();
    public int add(int x, int y);

    // attributes

    // a read-only attribute called Name of type String
    public String getName();

    // a read-write attribute called CacheSize of type int
    public int getCacheSize();
    public void setCacheSize(int size);
}
