package bank.adapter.http;

import java.util.Date;

public class UserDto {
    private String id;
    private String name;
    private String email;

    public UserDto(String id, String name, String email, Date registeredOn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registeredOn = registeredOn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegisteredOn(Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getRegisteredOn() {
        return registeredOn;
    }

    private Date registeredOn;
}
