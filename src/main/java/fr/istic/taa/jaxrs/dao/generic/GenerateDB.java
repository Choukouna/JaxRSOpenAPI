package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.dao.kanban.*;
import fr.istic.taa.jaxrs.model.Card;
import fr.istic.taa.jaxrs.model.Section;
import fr.istic.taa.jaxrs.model.Tablo;
import fr.istic.taa.jaxrs.model.User;

/**
 * Classe de génération de la bd selon le modèle
 */
public class GenerateDB {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Insert one card to retrieve it via postman
         */

        CardDAO cardDAO = new CardDAO();
        Card c = new Card();
        c.setLibelle("dockerization");
        Section s1 = new Section();
        s1.setAppartenance(new Tablo());
        c.setEtat(s1);
        //create user which will work on this card
        User us1 = new User();
        us1.setPseudo("Oklin");
        us1.setMdp("12345678");
        //add user to this card
        c.addWorkers(us1);
        //saved all objects linked to c in db
        cardDAO.save(c);
    }
}