package by.projectShop.model.crud;

import by.projectShop.model.entity.EntityClient;
import by.projectShop.model.utile.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ClientCRUD {

    public void save(EntityClient client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(client);
        session.flush();
        session.close();
    }
    public void delete(EntityClient client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(client);
        session.flush();
        session.close();
    }
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EntityClient entity = this.getById(id);
        session.delete(entity);
        session.flush();
        session.close();
    }
    public void update(EntityClient client){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(client);
        session.flush();
        session.close();
    }
    public List<EntityClient> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(EntityClient.class).list();
    }
    public EntityClient getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntityClient client = session.get(EntityClient.class, id);
        return client;
    }
}
