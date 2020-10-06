package fr.istic.taa.jaxrs.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@Entity
public class Section implements Serializable {

    private int idSection;
    private String libelle;
    private Tablo appartenance;
    private List<Card> mesFiches = new ArrayList<Card>();

    @Id
    @GeneratedValue
    public int getIdSection() {
        return idSection;
    }

    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Tablo getAppartenance() {
        return appartenance;
    }

    public void setAppartenance(Tablo appartenance) {
        this.appartenance = appartenance;
    }

    @OneToMany(mappedBy = "etat")
    @XmlTransient
    public List<Card> getMesFiches() {
        return mesFiches;
    }

    public void setMesFiches(List<Card> fiches) {
        this.mesFiches.addAll(fiches);
    }

    public void addMesFiches(Card card) {
        card.setEtat(this);
        this.setMesFiches(new ArrayList<Card>(){{add(card);}});
    }
}
