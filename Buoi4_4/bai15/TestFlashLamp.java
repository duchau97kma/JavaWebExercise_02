/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4.bai15;

/**
 *
 * @author Winter
 */
public class TestFlashLamp {

    public static void main(String[] args) {
        FlashLamp fl = new FlashLamp();
        Battery bt = new Battery();
        fl.setBattery(bt);
        for (int i = 0; i < 10; i++) {
            fl.turnOn();
            fl.turnOff();
        }
        System.out.println("Năng lượng còn lại là:" + fl.getBatteryInfo());
    }

}

