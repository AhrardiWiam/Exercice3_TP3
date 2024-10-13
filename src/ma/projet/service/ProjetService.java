/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.List;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class ProjetService implements IDao<Projet> {

    @Override
    public boolean create(Projet o) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return false;
    }

    @Override
    public Projet getById(int id) {
        Session session = null;
        Projet e = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Projet) session.get(Projet.class, id);
            session.getTransaction().commit();
            return e;
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return e;
    }

    @Override
    public List<Projet> getAll() {
        Session session = null;
        List<Projet> produits = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            produits = session.createQuery("from Projet").list();
            session.getTransaction().commit();
            return produits;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
        return produits;
    }

    public void TPlanifiéByProjet(Projet p) {
        for (Tache e : p.getTaches()) {
            System.out.println(e);
        }

    }



    public void TRéaliséByProjet(Projet p) {
        EmployeTacheService es = new EmployeTacheService();
        System.out.println("Projet : " + p.getId() + "           Nom : " + p.getNom() + "     Date début : " + p.getDateDebut());
        System.out.println("Listes des tâches :");
        System.out.printf("%-5s %-15s %-20s %-20s\n", "Num", "Nom", "Date Début réelle", "Date Fin réelle");

        for (EmployeTache e : es.getAll()) {
            if (e.getTache().getProjet().getId() == p.getId()) {
                System.out.printf("%-5d %-15s %-20s %-20s\n", 
                          e.getTache().getId(), e.getTache().getNom(), 
                          e.getId().getDateDebutRelle(), e.getDateFinRelle());
       
            }
        }
    }
}
