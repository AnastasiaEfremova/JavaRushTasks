package com.company.JavaCore.Level_4.NewComputer;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;


    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
