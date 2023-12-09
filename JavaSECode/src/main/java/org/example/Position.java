package org.example;

public enum Position {
    ARCHITECT("ARCHITECT","架构师"),
    PROGRAMMER("PROGRAMMER","程序员"),
    STYLIST("STYLIST","设计师");

    private String id;
    private String name;

    Position(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Position getPositionByName(String name){
        for (Position position : values()) {
            if (position.name.equals(name)){
                return position;
            }
        }
        return Position.PROGRAMMER;
    }
}
