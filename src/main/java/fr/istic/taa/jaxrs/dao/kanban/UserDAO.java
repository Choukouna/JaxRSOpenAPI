package fr.istic.taa.jaxrs.dao.kanban;

import fr.istic.taa.jaxrs.dao.generic.AbstractJpaDao;
import fr.istic.taa.jaxrs.model.User;

public class UserDAO extends AbstractJpaDao<Integer, User> {
    public UserDAO() {
        this.setClazz(User.class);
    }
}
