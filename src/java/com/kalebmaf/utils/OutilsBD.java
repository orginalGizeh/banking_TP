/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.utils;

import java.sql.ResultSet;

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
}
