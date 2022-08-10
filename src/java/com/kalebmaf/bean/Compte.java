/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.bean;

import java.io.Serializable;

/**
 *
 * @author Gizeh
 */
public class Compte implements Serializable{
    
    // attributs
    private static final Long serialUI = 1L;
    private String codeCompte;
    private String typeCompte;
    private double solde;
    
    // connstructeurs

    public Compte() {
    }

    public Compte(String codeCompte, String typeCompte, double solde) {
        this.codeCompte = codeCompte;
        this.typeCompte = typeCompte;
        this.solde = solde;
    }

    public Compte(String codeCompte) {
        this.codeCompte = codeCompte;
    }
    
    // accesseurs et mutateurs 

    public String getCodeCompte() {
        return codeCompte;
    }

    public void setCodeCompte(String codeCompte) {
        this.codeCompte = codeCompte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    
}
