package edu.source.it.lectures.lecture6.examples.tanks.inner;


public class Tank {
    private Gun gun;
    private int shellsQuantity;

    public Tank(int shellsQuantity) {
        this.gun = new Gun();
        this.shellsQuantity = shellsQuantity;
    }

    public void fire() {
        gun.fire();
    }

    public void load() {
        if (!gun.isLoaded()) {
            gun.load();
        } else {
            System.out.println("Gun is already loaded");
        }
    }

    public void reload(int shells) {
        shellsQuantity += shells;
    }

    public class Gun {
        private boolean loaded;

        public Gun() {
            this.loaded = false;
        }

        public boolean isLoaded() {
            return loaded;
        }

        public void setLoaded(boolean loaded) {
            if (shellsQuantity > 0) {
                this.loaded = loaded;
                shellsQuantity--;
            } else {
                System.out.println("Out of ammo! Go to the base!!!");
            }
        }

        public void load() {
            if (!isLoaded()) {
                setLoaded(true);
            } else {
                System.out.println("Already loaded, can't load!");
            }
        }

        public void fire() {
            if (isLoaded()) {
                System.out.println("Fire!!!!");
                setLoaded(false);
            } else {
                System.out.println("Have no shell in gun, please load!!");
            }
        }
    }

}
