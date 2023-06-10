package org.example;

class Cat implements Animal, Pet{
    public void cry(){
        System.out.println("야옹~!");
    }
    public void play(){
        System.out.println("쥐 잡기");
    }
}
