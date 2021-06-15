package by.projectShop.model.crud;

import by.projectShop.model.entity.EntityCoffeeProduct;
import by.projectShop.model.utile.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CoffeeProductCRUD {

    public void save(EntityCoffeeProduct coffeeProducts) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(coffeeProducts);
        session.flush();
        session.close();
    }

    public void update(EntityCoffeeProduct coffeeProduct){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(coffeeProduct);
        session.flush();
        session.close();
    }

    public void delete(EntityCoffeeProduct coffeeProducts) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(coffeeProducts);
        session.flush();
        session.close();
    }

    public void deleteById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        EntityCoffeeProduct entity = this.getById(id);
        session.delete(entity);
        session.flush();
        session.close();
    }

    public List<EntityCoffeeProduct> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return session.createCriteria(EntityCoffeeProduct.class).list();
    }

    public EntityCoffeeProduct getById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        EntityCoffeeProduct coffeeProducts = session.get(EntityCoffeeProduct.class, id);
        return coffeeProducts;
    }
}
