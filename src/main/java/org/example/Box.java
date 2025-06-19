package org.example;

import java.util.Objects;

public class Box {
    private String size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(size, box.size);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(size);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
