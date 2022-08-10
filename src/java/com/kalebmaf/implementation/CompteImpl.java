/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.implementation;

import com.kalebmaf.bean.Banque;
import com.kalebmaf.bean.Compte;
import com.kalebmaf.interfaces.ICompte;
import com.kalebmaf.utils.ConnexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Gizeh
 */
public class CompteImpl implements  ICompte{
    
    @Override
    public Compte getCompte(String code) {
         Compte unCompte = new Compte();
         return unCompte;
    }

    @Override
    public ArrayList<Compte> getAllComptesByCodeBanque(String codeBanque) {
         ArrayList<Compte> lesComptes = new ArrayList<>();
         ConnexionDB conBD = new ConnexionDB();
         Connection laConnexion = conBD.seConnecterMySql();
         PreparedStatement ps = null;
         ResultSet rs = null;
         
         try {
            String requestSql = "SELECT * FROM compte WHERE codeBanque=?";
            ps = laConnexion.prepareStatement(requestSql);
            ps.setString(1, codeBanque);
            rs = ps.executeQuery();
            
             while(rs.next()) {
                 BanqueImpl banqueImpl = new BanqueImpl();
                 Compte unCompte = new Compte();
                 unCompte.setCodeCompte(rs.getString(1));
                 unCompte.setTypeCompte(rs.getString(2));
                 unCompte.setSolde(rs.getDouble(3));
                 unCompte.setUneBanque(banqueImpl.getBanque(new Banque(rs.getString(4))));
                 lesComptes.add(unCompte);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return lesComptes;
    }
    
}
