package fr.istic.taa.jaxrs.dao.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.model.Card;

public class CardDAO extends AbstractJpaDao<Integer, Card> {
    public CardDAO() {
        this.setClazz(Card.class);
    }
}