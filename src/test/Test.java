/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Date;
import ma.projet.classes.Employe;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.EmployeTachePK;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author user
 */
public class Test {

    public static void main(String[] args) {
        //HibernateUtil.getSessionFactory();
        ProjetService ps = new ProjetService();
        TacheService ts = new TacheService();
        EmployeService es = new EmployeService();
        EmployeTacheService ems = new EmployeTacheService();

//        Création des employe
//        es.create(new Employe("Wiam", "Ahrardi", "0608091011"));
//        es.create(new Employe("Mohammed", "mimmih", "0605060708"));
//        es.create(new Employe("kamal", "eeeee", "0608091011"));
//        es.create(new Employe("salma", "ppppp", "0605060708"));
//
//       Création des projets
//        ps.create(new Projet("Projet A", new Date(124, 0, 16), new Date(124, 9, 1), es.getById(1)));
//        ps.create(new Projet("Projet B", new Date(124, 3, 10), new Date(125, 1, 7), es.getById(2)));
//
//       Création des Taches
//        ts.create(new Tache("Analyse", new Date(124, 0, 16), new Date(124, 2, 15), 1500, ps.getById(1)));
//        ts.create(new Tache("Développement", new Date(124, 3, 1), new Date(124, 6, 1), 3500, ps.getById(1)));
//        ts.create(new Tache("Test", new Date(124, 6, 5), new Date(124, 8, 10), 1500, ps.getById(1)));
//        ts.create(new Tache("Documentation", new Date(124, 8, 11), new Date(124, 9, 1), 1500, ps.getById(1)));
//        ts.create(new Tache("Analyse", new Date(124, 3, 10), new Date(124, 5, 15), 1500, ps.getById(2)));
//        ts.create(new Tache("Développement", new Date(124, 5, 20), new Date(124, 8, 15), 3500, ps.getById(2)));
//        ts.create(new Tache("Test", new Date(124, 8, 18), new Date(124, 11, 21), 1500, ps.getById(2)));
//        ts.create(new Tache("Documentation", new Date(124, 11, 25), new Date(125, 1, 7), 1500, ps.getById(2)));
//        
//        Création des EmployeTache
//        ems.create(new EmployeTache(new EmployeTachePK(3, 1,new Date(124, 0, 20 )),new Date(124, 2, 30)));
//        ems.create(new EmployeTache(new EmployeTachePK(1, 1,new Date(124, 7, 12 )),new Date(124, 9, 19)));
//        ems.create(new EmployeTache(new EmployeTachePK(2, 1,new Date(124, 9, 21 )),new Date(124, 10, 15)));
//        ems.create(new EmployeTache(new EmployeTachePK(1, 1,new Date(124, 3, 13 )),new Date(124, 5, 25)));
//        ems.create(new EmployeTache(new EmployeTachePK(2, 1,new Date(124, 9, 1 )),new Date(125, 0, 10)));
//        ems.create(new EmployeTache(new EmployeTachePK(3, 1,new Date(125, 0, 14 )),new Date(125, 1, 25)));
//         
        //Afficher les Taches d'un employe
        //es.TachesByEmploye(es.getById(1));
        //Afficher les projets d'un employe
         // es.ProjetByEmploye(es.getById(1));
        //Afficher les taches planifiés d'un projet
         // ps.TPlanifiéByProjet(ps.getById(1));
        //Afficher les taches réalisé dans un projet
            // ps.TRéaliséByProjet(ps.getById(1));
        //Afficher les taches ayant un prix supérieur à 1000 dh
         //   ts.TacheByPrix();
        //Afficher les taches réalisés entre deux dates
        ts.TacheByDate("2024/01/16", "2025/01/9");
    }
}