package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.dao.kanban.*;
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
         * Insert one user to retrieve it via postman
         */
        UserDAO dao = new UserDAO();
        User us = new User();
        us.setPseudo("Momo");
        us.setMdp("12345678");
        dao.save(us);
    }
}