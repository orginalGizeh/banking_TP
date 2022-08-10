/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gizeh
 */
public class ConnexionDB {
    
    private Connection laConnectionStatique;

    public Connection getLaConnectionStatique() {
        return laConnectionStatique;
    }

    public void setLaConnectionStatique(Connection laConnectionStatique) {
        this.laConnectionStatique = laConnectionStatique;
    }
    
    public Connection seConnecterMySql(){
        
        try {
            //Class.forName("");
            ParametresConnexionSQL lesParametres = new ParametresConnexionSQL();
            laConnectionStatique = DriverManager.getConnection(lesParametres.getUrlBD(), 
                    lesParametres.getUser(), lesParametres.getPsssword());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return laConnectionStatique;
    }
    
    public static void main(String [] args){
        Connection con = null;
        try {
            ConnexionDB cnx = new ConnexionDB();
            con = cnx.seConnecterMySql();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            OutilsBD.fermerConnexion(con);
        }
    }
}
