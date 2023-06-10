package org.example;

class Cat extends Animal implements Pet{ // Animal이 변경된 점에 맞춰서 extends Animal로 변경
    public void cry(){
        System.out.println("야옹~!");
    }
    public void play(){
        System.out.println("쥐 잡기");
    }
}
