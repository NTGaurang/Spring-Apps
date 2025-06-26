package com.gaurang;



public class Dev {

     private Computer comp;

    private int age;

public Dev()
{
    System.out.println("Dev Constructor");
}

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor");
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build()
    {

        System.out.println("Working on Awesome Project");
        comp.compile();
    }
}
