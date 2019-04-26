/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqB.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 *
 * @author AdhityaWP
 */
public class LoginForm {

    @NotBlank
    @Size(min = 4, max = 70)
    private String id;

    @NotBlank
    @Size(min = 4, max = 70)
    private String password;

    public LoginForm() {
    }
    
    public LoginForm(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public LoginForm(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
