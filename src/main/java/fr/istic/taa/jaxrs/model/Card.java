package fr.istic.taa.jaxrs.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//enum Section {ToDO, Doing, Done};

@Entity
@XmlRootElement
public class Card implements Serializable {
    private int idCard;
    private String libelle;
    private Date dateButoire;
    private int tempsRestant;
    private String lieu;
    private String url;
    private String description;

    private Section etat;
    private List<User> workers = new ArrayList<User>();

    @Id
    @GeneratedValue
    @XmlElement(name="idCard")
    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int id) {
        this.idCard = id;
    }

    @XmlElement(name="libelle")
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlElement(name="dateButoire")
    public Date getDateButoire() {
        return dateButoire;
    }

    public void setDateButoire(Date dateButoire) {
        this.dateButoire = dateButoire;
    }

    @XmlElement(name="tempsRestant")
    public int getTempsRestant() {
        return tempsRestant;
    }

    public void setTempsRestant(int tempsRestant) {
        this.tempsRestant = tempsRestant;
    }

    @XmlElement(name="lieu")
    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @XmlElement(name="url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @XmlElement(name="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @ManyToOne(cascade= CascadeType.ALL)

    @XmlElement(name="etat")
    public Section getEtat() {
        return etat;
    }
    public void setEtat(Section etat) {
        this.etat = etat;
    }

    @ManyToMany(mappedBy="mesJobs")
    @XmlElementWrapper(name="workers")
    @XmlElement(name="worker")
    public List<User> getWorkers() {
        return workers;
    }
    public void setWorkers(List<User> workers) {
        this.workers.addAll(workers);
    }
    public void addWorkers(User user) {
        user.addWork(this);
        this.setWorkers(new ArrayList<User>(){{add(user);}});
    }
}
