package fr.istic.taa.jaxrs.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tablo implements Serializable {
    private int idTab;
    private String titreProjet;
    List<Section> sections = new ArrayList<Section>();

    @Id
    @GeneratedValue
    public int getIdTab() {
        return idTab;
    }

    public void setIdTab(int id) {
        this.idTab = id;
    }

    public String getTitreProjet() {
        return titreProjet;
    }

    public void setTitreProjet(String titreProjet) {
        this.titreProjet = titreProjet;
        this.sections = new ArrayList<Section>();
    }

    @OneToMany(mappedBy = "appartenance")
    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections.addAll(sections);
    }

    public void addSection(Section section) {
        section.setAppartenance(this);
        this.setSections(new ArrayList<Section>(){{add(section);}});
    }
}