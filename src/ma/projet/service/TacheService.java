/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.Tache;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import test.Test;

/**
 *
 * @author user
 */
public class TacheService implements IDao<Tache> {

    @Override
    public boolean create(Tache o) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(o);
            session.getTransaction().commit();
            return true;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return false;
    }


    @Override
    public Tache getById(int id) {
        Session session = null;
        Tache e  = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            e = (Tache) session.get(Tache.class, id);
            session.getTransaction().commit();
            return e;
        } catch (HibernateException ex) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return e;
    }

    @Override
    public List<Tache> getAll() {
        Session session = null;
        List<Tache>  taches = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            taches = session.createQuery("from Tache").list();
            session.getTransaction().commit();
            return taches;
        } catch (HibernateException e) {
            session.getTransaction().rollback();
        }finally{
            session.close();
        }
        return taches;
    }

   public void TacheByPrix(){
       
       try {

            Session session = HibernateUtil.getSessionFactory().openSession();
            String hql = "FROM Tache WHERE prix > 1000";
            List<Tache> taches = new ArrayList<>();
            taches = session.createQuery(hql).list();
            System.out.println("Les taches ayant un prix supérieur à 1000 :");
            for (Tache e : taches) {
                System.out.println(e);
            }
        } catch (Throwable ex) {
            System.err.println("La création de la session a échouée." + ex);
            throw new ExceptionInInitializerError(ex);
        }
   }
   public void TacheByDate(String d1, String d2){
         EmployeTacheService ets = new EmployeTacheService();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date1 = dateFormat.parse(d1);
            Date date2 = dateFormat.parse(d2);
            System.out.println("Les taches réalisées entre " + d1 + " et " + d2 + " :");
            for (EmployeTache e : ets.getAll()) {
                if (e.getId().getDateDebutRelle().after(date1) && e.getDateFinRelle().before(date2)) {
                    System.out.println(e.getTache());
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

       
   }
}
