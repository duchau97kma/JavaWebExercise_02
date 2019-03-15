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
public class FlashLamp {

    private boolean status = true;
    private Battery battery;

    public FlashLamp() {
        status = false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setBattery(Battery b) {
        battery = b;
        b.getEnergy();
        System.out.println("Đã nạp pin cho đèn!");
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

    public void turnOn() {

        if (status || this.battery.getEnergy() > 0) {
            System.out.println("Đèn sáng");
            this.battery.decreaseEnergy();
        }
//        else{
//            System.out.println("Tắt cmn rồi!");
//        }
    }

    public void turnOff() {
        if (!status || this.battery.getEnergy() < 0) {
            System.out.println("Đèn không sáng");
        }
    }
}
