package by.projectShop.controller.beans;


import by.projectShop.controller.beans.objects.Product;
import by.projectShop.model.entity.EntityCoffeeProduct;
import by.projectShop.model.logic.WorkWithDB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "catalogBean", eager = true)
@SessionScoped
public class CatalogBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String info ="default";
    private String load = "";
    private Product newProduct = new Product();
    private List<Product> products = new ArrayList<>();
    WorkWithDB workWithDB;

    {
        workWithDB = new WorkWithDB();
        convectorProduct(workWithDB.getAllProducts());
    }

    private void convectorProduct(List<EntityCoffeeProduct> entityProducts){
        for(EntityCoffeeProduct product : entityProducts){
            products.add(new Product(
                    product.getId(),
                    product.getNameCoffee(),
                    product.getManufacturer(),
                    product.getGrow(),
                    product.getDegreeOfRoast(),
                    product.getGrainGrade(),
                    product.getPrice(),
                    product.getInformation(),
                    product.getUrl(),
                    0,
                    0
            ));
        }
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = null;
        this.newProduct = newProduct;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}