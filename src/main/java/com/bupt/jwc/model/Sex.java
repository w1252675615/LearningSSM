package com.bupt.jwc.model;

public enum Sex {
    MALE(11,"male"),
    FEMALE(00,"female");
    private int id;

    private String name;

    Sex(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Sex getSexById(int id) {
        for(Sex sex : Sex.values()) {
            if (sex.id == id) return sex;
        }
        return null;
    }

    public static Sex getSexByName(String name) {
        for(Sex sex : Sex.values()) {
            if (sex.name.equals(name)) return sex;
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
