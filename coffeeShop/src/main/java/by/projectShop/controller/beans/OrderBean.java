package by.projectShop.controller.beans;

import by.projectShop.controller.beans.objects.Product;
import by.projectShop.controller.beans.objects.User;
import by.projectShop.model.entity.EntityClient;
import by.projectShop.model.entity.EntityCoffeeProduct;
import by.projectShop.model.entity.EntityOrderCoffee;
import by.projectShop.model.logic.WorkWithDB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderBean {

    private List<Product> products = new ArrayList<>();
    private Product product = new Product();
    private User client = new User();
    private boolean delivery = false;
    private float totalPrice = 0;
    WorkWithDB workWithDB = new WorkWithDB();




    public void saveOrder(){
        List<EntityCoffeeProduct> entityCoffeeProducts = new ArrayList<>();

        EntityClient entityClient = new EntityClient();
        entityClient.setName(client.getName());
        entityClient.setPhone(client.getPhone());
        entityClient.setEmail(client.getEmail());
        entityClient.setAddress(client.getAddress());

        workWithDB.saveToClient(entityClient);

        for(Product product : products){
            EntityOrderCoffee entityOrderCoffee = new EntityOrderCoffee();
            entityOrderCoffee.setDelivery(delivery);
            entityOrderCoffee.setClientId(entityClient.getId());
            entityOrderCoffee.setProductId(product.getId());
            entityOrderCoffee.setNetWeight(product.getNetWeight());
            entityOrderCoffee.setPrice(product.getPrice());

            workWithDB.saveToOrder(entityOrderCoffee);
        }
    }

    public void addProduct(Product product){
            products.add(product);
    }

    public void deleteProduct(){
        for(Product p : products){
            if(p.getId() == product.getId()) {
                products.remove(p);
            }
        }
    }

    public void updateProduct(Product product){
        this.product = null;
        this.product = product;
    }

    private float PriceAll(){
        float total = 0;
        for(Product p : products)
            total += p.getPriceTotal();
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        if(delivery)
            totalPrice += 10;
        else
            totalPrice -= 10;
        this.delivery = delivery;
    }

    public float getTotalPrice() {
        totalPrice = PriceAll();
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
