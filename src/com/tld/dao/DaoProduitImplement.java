package com.tld.dao;

import com.tld.model.Produit;
import com.tld.utils.ConnexionJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaoProduitImplement implements DaoProduitInterface{
    ConnexionJDBC connexionJDBC;
    // Constructeur de la classe DaoProduitImplement
    public DaoProduitImplement(){
        this.connexionJDBC = new ConnexionJDBC();
    }
    Statement stmt;
    List<Produit> listProduits = new ArrayList<>();

    // Méthode pour récupérer tous les produits de la base de données
    @Override
    public List<Produit> getAllProduits() {
        String request = "SELECT * FROM produits";
        ResultSet resultSet;
        try{
            resultSet = connexionJDBC.getConnection().createStatement().executeQuery(request);

            Produit produit = null;

            while (resultSet.next()){
                produit = new Produit(
                        resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getBoolean("estDispo"),
                        resultSet.getDate("peremption").toLocalDate()
                );

                listProduits.add(produit);
            }
            connexionJDBC.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listProduits;

    }

    // Méthode pour récupérer un seul produit grâce a son id
    @Override
    public Produit getByID(int id) {
        String request = "SELECT * FROM produits WHERE id = " + id + ";";
        ResultSet resultSet;
        Produit produit = null;
        try {
            resultSet = connexionJDBC.getConnection().createStatement().executeQuery(request);

            if (resultSet.next()) {
                produit = new Produit(
                        resultSet.getInt("id"),
                        resultSet.getString("nom"),
                        resultSet.getBoolean("estDispo"),
                        resultSet.getDate("peremption").toLocalDate()
                );
            }
            connexionJDBC.getConnection().close();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return produit;
    }

    // Méthode pour créer un produit
    @Override
    public void createProduit(Produit produit) {
        String request = "INSERT INTO produits(id, nom, EstDispo, peremption) VAlUES (" + produit.getId() + ",'" + produit.getNom() + "'," + produit.isEstDispo() + ",'" + produit.getPeremption() + "');";
        int resultSet;
        try {
            resultSet = connexionJDBC.getConnection().createStatement().executeUpdate(request);

            connexionJDBC.getConnection().close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour modifier toutes les données d'un produit
    @Override
    public void updateProduit(Produit produit,int id) {
        String request = "UPDATE produits SET id = " + produit.getId()+ ", nom = '"+produit.getNom()+"', EstDispo = "+produit.isEstDispo()+", peremption = '"+produit.getPeremption()+"' WHERE id = "+id+";";
        int resultSet;
        try {
            resultSet = connexionJDBC.getConnection().createStatement().executeUpdate(request);

            connexionJDBC.getConnection().close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // Méthode pour supprimer un produit
    @Override
    public void deleteProduit(int id) {
        String request = "DELETE FROM produits WHERE id = "+ id + ";";
        int resultSet;
        try {
            resultSet = connexionJDBC.getConnection().createStatement().executeUpdate(request);

            connexionJDBC.getConnection().close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
