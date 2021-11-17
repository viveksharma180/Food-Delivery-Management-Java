/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

/**
 *
 * @author viveksharma
 */
public class OrderTemplate {
    private DishTemplate dish;
    private RestaurantTemplate restaurant;
    private CustomerTemplate customer;

    public DishTemplate getDish() {
        return dish;
    }

    public void setDish(DishTemplate dish) {
        this.dish = dish;
    }

    public RestaurantTemplate getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantTemplate restaurant) {
        this.restaurant = restaurant;
    }

    public CustomerTemplate getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerTemplate customer) {
        this.customer = customer;
    }

    public OrderTemplate(DishTemplate dish, RestaurantTemplate restaurant, CustomerTemplate customer) {
        this.dish = dish;
        this.restaurant = restaurant;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" + "dish=" + dish + ", restaurant=" + restaurant + ", customer=" + customer + '}';
    }
}
