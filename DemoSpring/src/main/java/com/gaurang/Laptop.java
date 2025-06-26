package com.gaurang;

public class Laptop implements Computer {
    public Laptop()
    {
        System.out.println("Laptop Constructor");
    }
    @Override
    public void compile()
    {
        System.out.println("compiling in Laptop");
    }
}
