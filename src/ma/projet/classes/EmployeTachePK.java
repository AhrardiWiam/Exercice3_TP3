/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Embeddable
public class EmployeTachePK implements Serializable{
    private int employe;
    private int tache;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebutRelle;

    public EmployeTachePK() {
    }

    public EmployeTachePK(int employe, int tache, Date dateDebutRelle) {
        this.employe = employe;
        this.tache = tache;
        this.dateDebutRelle = dateDebutRelle;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }

    public int getTache() {
        return tache;
    }

    public void setTache(int tache) {
        this.tache = tache;
    }

    public Date getDateDebutRelle() {
        return dateDebutRelle;
    }

    public void setDateDebutRelle(Date dateDebutRelle) {
        this.dateDebutRelle = dateDebutRelle;
    }
    
    
    
}
