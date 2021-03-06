package fr.istic.taa.jaxrs.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@Entity
public class User implements Serializable {
    private int idUser;
    private String pseudo;
    private String mdp;
    private List<Card> mesJobs= new ArrayList<Card>();

    /*public User() {
        mesJobs = new ArrayList<Card>();
    }*/
    @Id
    @GeneratedValue
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int id) {
        this.idUser = id;
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
    @XmlTransient
    public List<Card> getMesJobs() {
        return mesJobs;
    }
    public void setMesJobs(List<Card> job) {
        this.mesJobs.addAll(job);
    }

    public void addWork(Card card) {
        //card.addWorkers(this);
        this.setMesJobs(new ArrayList<Card>(){{add(card);}});
    }
}
