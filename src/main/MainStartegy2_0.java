package main;

import patterns.startegy2_0.Bus;
import patterns.startegy2_0.Car;
import patterns.startegy2_0.Walk;


public class MainStartegy2_0 {
    public static void main(String[] args) {
        Car car = new Car();
        car.buildWay();

        Bus bus = new Bus();
        bus.buildWay();

        Walk walk = new Walk();
        walk.buildWay();
    }
}
