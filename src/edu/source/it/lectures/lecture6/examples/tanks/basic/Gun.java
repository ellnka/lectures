package edu.source.it.lectures.lecture6.examples.tanks.basic;

public class Gun {
    private boolean loaded;

    public Gun() {
        this.loaded = false;
    }

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
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
