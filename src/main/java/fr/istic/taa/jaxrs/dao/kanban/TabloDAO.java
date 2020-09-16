package fr.istic.taa.jaxrs.dao.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.model.Tablo;

public class TabloDAO extends AbstractJpaDao<Integer, Tablo> {
    public TabloDAO() {
        this.setClazz(Tablo.class);
    }
}