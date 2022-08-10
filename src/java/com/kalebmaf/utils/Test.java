/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.utils;

import com.kalebmaf.bean.Banque;
import com.kalebmaf.bean.Compte;
import com.kalebmaf.implementation.BanqueImpl;
import com.kalebmaf.implementation.CompteImpl;
import java.util.ArrayList;

/**
 *
 * @author Gizeh
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BanqueImpl b = new BanqueImpl();
        CompteImpl c = new CompteImpl();
        ArrayList<Banque> lesBanques = b.getAllBanque();
        System.out.println(lesBanques.toString());
//        for (Banque lesBanque : lesBanques) {
//            
//        }
//        ArrayList<Compte> lesComptes = c.getAllComptesByCodeBanque(lesBanques.get(0).getCodeBanque());
//        for (Compte lesCompte : lesComptes) {
//            
//        }
    }
    
}
