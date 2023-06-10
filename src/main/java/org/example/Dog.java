package org.example;

class Dog implements Animal, Pet{
    public void  cry(){ // 메서드 오버라이딩
        System.out.println("멍멍");
    }
    public void play(){
        System.out.println("원반 던지기");
    }
}
