/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.implementation;

import com.kalebmaf.bean.Banque;
import com.kalebmaf.interfaces.IBanque;
import com.kalebmaf.utils.ConnexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gizeh
 */
public class BanqueImpl implements IBanque{

    @Override
    public Banque getBanque(Banque uneBanque) {
        Banque laBanque = new Banque();
        ConnexionDB conBD = new ConnexionDB();
        Connection laConexion = conBD.seConnecterMySql();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String requestSql = "SELECT * FROM compte WHERE code=?";
            ps = laConexion.prepareStatement(requestSql);
            ps.setString(1, uneBanque.getCodeBanque());
            rs = ps.executeQuery();
            
             if (rs!=null) {
                 
                 laBanque.setCodeBanque(rs.getString(1));
                 laBanque.setNomBanque(rs.getString(2));
                 laBanque.setVilleQg(rs.getString(3));
                 
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return uneBanque;
    }

    @Override
    public ArrayList<Banque> getAllBanque() {
        ArrayList<Banque> lesBanques = new ArrayList<>();
        ConnexionDB conBD = new ConnexionDB();
        Connection laConecxion = conBD.seConnecterMySql();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String requestSql = "SELECT * FROM banque ORDER BY nom";
            ps = laConecxion.prepareStatement(requestSql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                Banque uneBanque = new Banque();
                uneBanque.setCodeBanque(rs.getString(1));
                uneBanque.setNomBanque(rs.getString(2));
                uneBanque.setVilleQg(rs.getString(3));
                lesBanques.add(uneBanque);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lesBanques;
    }
    
}
