/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

/**
 *
 * @author viveksharma
 */
public class RestaurantTemplate {
    private String restaurantName;
    private String restaurantAddress;
    private Long restaurantNumber;
    private String restaurantCuisine;
    private String restaurantUsername;
    private String restaurantPassword;

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public Long getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(Long restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantCuisine() {
        return restaurantCuisine;
    }

    public void setRestaurantCuisine(String restaurantCuisine) {
        this.restaurantCuisine = restaurantCuisine;
    }

    public String getRestaurantUsername() {
        return restaurantUsername;
    }

    public void setRestaurantUsername(String restaurantUsername) {
        this.restaurantUsername = restaurantUsername;
    }

    public String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(String restaurantPassword) {
        this.restaurantPassword = restaurantPassword;
    }

    public RestaurantTemplate(String restaurantName, String restaurantAddress, Long restaurantNumber, String restaurantCuisine, String restaurantUsername, String restaurantPassword) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantNumber = restaurantNumber;
        this.restaurantCuisine = restaurantCuisine;
        this.restaurantUsername = restaurantUsername;
        this.restaurantPassword = restaurantPassword;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "restaurantName=" + restaurantName + ", restaurantAddress=" + restaurantAddress + ", restaurantNumber=" + restaurantNumber + ", restaurantCuisine=" + restaurantCuisine + ", restaurantUsername=" + restaurantUsername + ", restaurantPassword=" + restaurantPassword + '}';
    }
}
