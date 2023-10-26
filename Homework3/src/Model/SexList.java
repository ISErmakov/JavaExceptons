package Model;

import java.util.List;

public enum SexList {
    MALE ("m"),
    FAMALE ("f");

    private String sex;

    SexList(String sex){
        this.sex = sex;
    }

    @Override
    public String toString() {
        return sex;
    }
}