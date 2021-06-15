package by.projectShop.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_coffee", schema = "public", catalog = "coffeeShop")
public class EntityOrderCoffee {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "delivery", nullable = true)
    private Boolean delivery;

    @Override
    public String toString() {
        return  "id = " + id + '\n' +
                ", delivery = " + delivery + '\n' +
                ", netWeight = " + netWeight + '\n' +
                ", price = " + price + '\n' +
                ", clientId = " + clientId + '\n' +
                ", productId = " + productId + '\n' +
                "------------";
    }

    @Column(name = "net_weight", nullable = false)
    private int netWeight;
    @Column(name = "price", nullable = false)
    private int price;
    @Column(name = "client_id", nullable = false)
    private int clientId;
    @Column(name = "product_id", nullable = false)
    private int productId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public int getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(int netWeight) {
        this.netWeight = netWeight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityOrderCoffee that = (EntityOrderCoffee) o;

        if (id != that.id) return false;
        if (netWeight != that.netWeight) return false;
        if (price != that.price) return false;
        if (delivery != null ? !delivery.equals(that.delivery) : that.delivery != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (delivery != null ? delivery.hashCode() : 0);
        result = 31 * result + netWeight;
        result = 31 * result + price;
        return result;
    }

   }
