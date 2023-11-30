package com.tld.dao;

import com.mysql.cj.xdevapi.Client;
import com.tld.model.Produit;

import java.time.LocalDate;
import java.util.List;

public interface DaoProduitInterface {
    public List<Produit> getAllProduits();
    public Produit getByID(int id);
    public void createProduit(Produit produit);
    public void updateProduit(Produit produit,int id);
    public void deleteProduit(int id);
}
