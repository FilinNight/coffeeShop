package by.projectShop.model.crud;
import java.util.List;

import by.projectShop.model.entity.EntityOrderCoffee;
import by.projectShop.model.utile.HibernateUtil;
import org.hibernate.Session;

public class OrderCoffeeCRUD {

    public void save(EntityOrderCoffee orderCoffee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(orderCoffee);
        session.flush();
        session.close();
    }
    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EntityOrderCoffee entity = this.getById(id);
        session.delete(entity);
        session.flush();
        session.close();
    }
    public void delete(EntityOrderCoffee orderCoffee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(orderCoffee);
        session.flush();
        session.close();
    }
    public void update(EntityOrderCoffee orderCoffee){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(orderCoffee);
        session.flush();
        session.close();
    }
    public List<EntityOrderCoffee> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(EntityOrderCoffee.class).list();
    }
    public EntityOrderCoffee getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntityOrderCoffee orderCoffee = session.get(EntityOrderCoffee.class, id);
        return orderCoffee;
    }

}

