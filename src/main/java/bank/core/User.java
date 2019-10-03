package bank.core;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "USERS" )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;
    private String name;
    private String email;
    private Date registeredOn;

    public User() { }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getRegisteredOn() {
        return registeredOn;
    }
}
