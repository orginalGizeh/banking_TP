/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kalebmaf.interfaces;

import com.kalebmaf.bean.Compte;
import java.util.ArrayList;

/**
 *
 * @author Gizeh
 */
public interface ICompte {
    
    abstract Compte getCompte(String code);
    abstract ArrayList<Compte> getAllComptes();
}
