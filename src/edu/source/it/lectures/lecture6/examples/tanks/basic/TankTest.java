package edu.source.it.lectures.lecture6.examples.tanks.basic;

public class TankTest {
    public static void main(String[] args) {
        Tank tank = new Tank(new Gun(), 3);
        tank.fire();
        tank.fire();
        tank.load();
        tank.fire();
        tank.fire();
        tank.load();
        tank.fire();
        tank.fire();
        tank.load();
        tank.fire();
        tank.fire();
        tank.load();
        tank.fire();
        tank.fire();
    }
}
