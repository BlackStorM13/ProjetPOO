package com.tld;

import com.tld.dao.DaoProduitImplement;
import com.tld.model.Produit;

public class AppGetById {
    public static void main(String[] args) {
        DaoProduitImplement dao = new DaoProduitImplement();
        Produit produit = new Produit();
        produit = dao.getByID(2);
        System.out.println(produit.toString());
    }
}
