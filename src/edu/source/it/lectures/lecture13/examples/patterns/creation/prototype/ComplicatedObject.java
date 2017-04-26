package edu.source.it.lectures.lecture13.examples.patterns.creation.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplicatedObject implements Cloneable {
    private List<String> strings; //some heavy data.it should be the same for all objects

    public ComplicatedObject() {
        strings = new ArrayList<>();
    }

    public ComplicatedObject(List<String> strings) {
        this.strings = strings;
    }

    public ComplicatedObject loadData() {
        strings.addAll(Arrays.asList("Data 1", "Data2", "Data3", "Data4"));
        return this;
    }

    public List<String> getStrings() {
        return strings;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>(strings);
        return new ComplicatedObject(temp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplicatedObject)) return false;

        ComplicatedObject that = (ComplicatedObject) o;

        return !(strings != null ? !strings.equals(that.strings) : that.strings != null);

    }

    @Override
    public int hashCode() {
        return strings != null ? strings.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ComplicatedObject{" +
                "strings=" + strings +
                '}';
    }
}
