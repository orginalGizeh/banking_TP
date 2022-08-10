/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Gizeh
 */
public class OutilsBD {
    
    //fermerture ResultSet
    public static void fermerConnexion(ResultSet rs){
        if (rs!=null) {
            try {
                rs.close();
            } catch (Exception e) {
                System.out.println("Erreru fermeture connexion RS");
            }
        }
    }
    
    public static void fermerConnexion(Statement st){
        if (st!=null) {
            try {
                st.close();
            } catch (Exception e) {
                System.out.println("Erreur fermeture connexion ST");
            }
        }
    }
    
    public static void fermerConnexion(PreparedStatement pst){
        if (pst!=null) {
            try {
                pst.close();
            } catch (Exception e) {
                System.out.println("Erreur fermeture connexion PST");
            }
        }
    }
}
