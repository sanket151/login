package com.wilp.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    String username;
    String password;
  
    @Override
    public String toString() {
        return "User [id=" + id + ", password=" + password + ", username=" + username + "]";
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
