package io.jzheaux.springsecurity.resolutions;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name="users")
public class User implements Serializable {
    @Id
    UUID id;

    @Column
    String username;

    @Column
    String password;

    @Column
    boolean enabled = true;

    User() {}

    public User(String username, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }
}
