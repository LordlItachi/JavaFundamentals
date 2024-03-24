package com.company;
/*
-> in abstract classes some methods may be implemented and others are abstract methods(which are not implemented )
->but in interfaces none of the methods are implemented
-> thus for us to inherit interfaces all methods of the interfaces must be implemented
-> we can inherit only one abstract parent class, but we can inherit as many interfaces as we want in a single child.
-> There is a rule that every method of interfaces is only and only public whether you define it or not .

 */
interface bycycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class heroCycle implements bycycle{
    int speed;
    heroCycle(){
    }
    heroCycle(int speed){
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBrake(int decrement){
        this.speed -= decrement;
    }
    public void speedUp(int increment){
        this.speed += increment;
    }
}
public class Java_54_Interfaces {
    public static void main(String[] args) {
        heroCycle cycle1 = new heroCycle();
        cycle1.setSpeed(7);
        cycle1.speedUp(5);
        cycle1.applyBrake(4);
        System.out.println("Speed of HeroCycle after crossing a turn while drifting : "+ cycle1.getSpeed());

    }
}
