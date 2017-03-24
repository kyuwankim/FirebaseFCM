package com.kyuwankim.android.firebasefcm;

/**
 * Created by kimkyuwan on 2017. 3. 15..
 */

public class User {
    String id;
    String password;
    String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
