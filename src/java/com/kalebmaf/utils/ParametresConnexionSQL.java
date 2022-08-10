/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.utils;

/**
 *
 * @author Gizeh
 */
public class ParametresConnexionSQL {
    
    //  attribut
    private String urlBD;
    private String user;
    private String psssword;
    
    // constructor

    public ParametresConnexionSQL() {
        urlBD = "jdbc:mysql://localhost:3306/banking";
        user = "root";
        psssword = "";
    }
    
    
    // accesseurs et mutateurs 

    public String getUrlBD() {
        return urlBD;
    }

    public void setUrlBD(String urlBD) {
        this.urlBD = urlBD;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsssword() {
        return psssword;
    }

    public void setPsssword(String psssword) {
        this.psssword = psssword;
    }
    
}
