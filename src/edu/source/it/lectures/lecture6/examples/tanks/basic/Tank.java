package edu.source.it.lectures.lecture6.examples.tanks.basic;

public class Tank {
    private Gun gun;
    private int shellsQuantity;

    public Tank(Gun gun, int shellsQuantity) {
        this.gun = gun;
        this.shellsQuantity = shellsQuantity;
    }

    public void fire() {
        gun.fire();
    }

    public void load() {
        if (!gun.isLoaded()) {
            if (shellsQuantity > 0){
                gun.load();
                shellsQuantity--;
            } else {
                System.out.println("Out of ammo! Go to the base!!!");
            }
        } else {
            System.out.println("Gun is already loaded");
        }
    }

    public void reload(int shells) {
        shellsQuantity += shells;
    }
}
