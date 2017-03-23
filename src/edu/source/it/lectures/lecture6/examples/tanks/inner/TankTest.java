package edu.source.it.lectures.lecture6.examples.tanks.inner;

public class TankTest {
    public static void main(String[] args) {
        Tank tank = new Tank(2);
        tank.fire();
        tank.load();
        tank.load();
        tank.fire();
        tank.load();
        tank.fire();
        tank.load();
    }
}
