package by.projectShop.model.logic;

import by.projectShop.model.crud.ClientCRUD;
import by.projectShop.model.crud.CoffeeProductCRUD;
import by.projectShop.model.crud.OrderCoffeeCRUD;
import by.projectShop.model.entity.EntityClient;
import by.projectShop.model.entity.EntityCoffeeProduct;
import by.projectShop.model.entity.EntityOrderCoffee;

import java.util.List;

public class WorkWithDB {

    private CoffeeProductCRUD productCRUD;
    private ClientCRUD clientCRUD;
    private OrderCoffeeCRUD orderCoffeeCRUD;

    public WorkWithDB()
    {
        this.productCRUD = new CoffeeProductCRUD();
        this.clientCRUD = new ClientCRUD();
        this.orderCoffeeCRUD = new OrderCoffeeCRUD();
    }

    public void saveToProduct(EntityCoffeeProduct product) {
        productCRUD.save(product);
    }
    public void saveToClient(EntityClient client) {
        clientCRUD.save(client);
    }
    public void saveToOrder(EntityOrderCoffee orderCoffee) {
        orderCoffeeCRUD.save(orderCoffee);
    }
    public void updateToProduct(EntityCoffeeProduct product){
        productCRUD.update(product);
    }
    public void updateToClient(EntityClient client){
        clientCRUD.update(client);
    }
    public void updateToOrder(EntityOrderCoffee order){
        orderCoffeeCRUD.update(order);
    }
    public void deleteProduct_id(int id){
        productCRUD.deleteById(id);
    }
    public void deleteClient_id(int id){
        clientCRUD.deleteById(id);
    }
    public void deleteOrder_id(int id){
        orderCoffeeCRUD.deleteById(id);
    }
    public void deleteProduct(EntityCoffeeProduct product){
        productCRUD.delete(product);
    }
    public void deleteClient(EntityClient client){
        clientCRUD.delete(client);
    }
    public void deleteOrder(EntityOrderCoffee order){
        orderCoffeeCRUD.delete(order);
    }
    public EntityCoffeeProduct getProduct_Id(int id){
        return productCRUD.getById(id);
    }
    public EntityClient getClient_Id(int id){
        return clientCRUD.getById(id);
    }
    public EntityOrderCoffee getOrder_Id(int id){
        return orderCoffeeCRUD.getById(id);
    }
    public List<EntityCoffeeProduct> getAllProducts(){
        return productCRUD.getAll();
    }
    public List<EntityClient> getAllClients(){
        return clientCRUD.getAll();
    }
    public List<EntityOrderCoffee> getAllOrders(){
        return orderCoffeeCRUD.getAll();
    }

}
