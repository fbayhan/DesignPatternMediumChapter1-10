package com.fatih.designpattern.patterns.Behavioral.State;

public interface Connection {
    public void open();
    public void close();
    public void log();
    public void update();
}
