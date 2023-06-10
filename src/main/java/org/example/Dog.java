package org.example;

class Dog extends Animal implements Pet{ // Animal이 변경된 점에 맞춰서 extends Animal로 변경
    public void  cry(){ // 메서드 오버라이딩
        System.out.println("멍멍");
    }
    public void play(){
        System.out.println("원반 던지기");
    }
}
