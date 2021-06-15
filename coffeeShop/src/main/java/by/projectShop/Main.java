package by.projectShop;

import by.projectShop.model.crud.CoffeeProductCRUD;
import by.projectShop.model.entity.EntityCoffeeProduct;
import by.projectShop.model.logic.WorkWithDB;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        WorkWithDB workWithDB = new WorkWithDB();
        List<EntityCoffeeProduct> list = workWithDB.getAllProducts();

        for(EntityCoffeeProduct product : list)
            System.out.println(product);


    }
}
