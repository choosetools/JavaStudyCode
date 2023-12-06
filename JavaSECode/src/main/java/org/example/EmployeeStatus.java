package org.example;

public enum EmployeeStatus {
    FREE("FREE","空闲"),
    BUSY("BUSY","忙"),
    HAVE_QUITTED("HAVE_QUITTED","已离职");

    private String id;
    private String name;

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

    EmployeeStatus(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static EmployeeStatus getStatusByName(String name){
        for (EmployeeStatus status : values()) {
            if (status.getId().equals(name)){
                return status;
            }
        }
        return FREE;
    }
}
