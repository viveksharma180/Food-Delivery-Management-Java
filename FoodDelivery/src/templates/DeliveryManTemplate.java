/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

/**
 *
 * @author viveksharma
 */
public class DeliveryManTemplate {
    private String deliveryManName;
    private String deliveryManAddress;
    private Long deliveryManContact;
    private String deliveryManUsername;
    private String deliveryManPassword;
    private boolean available;

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getDeliveryManAddress() {
        return deliveryManAddress;
    }

    public void setDeliveryManAddress(String deliveryManAddress) {
        this.deliveryManAddress = deliveryManAddress;
    }

    public Long getDeliveryManContact() {
        return deliveryManContact;
    }

    public void setDeliveryManContact(Long deliveryManContact) {
        this.deliveryManContact = deliveryManContact;
    }

    public String getDeliveryManUsername() {
        return deliveryManUsername;
    }

    public void setDeliveryManUsername(String deliveryManUsername) {
        this.deliveryManUsername = deliveryManUsername;
    }

    public String getDeliveryManPassword() {
        return deliveryManPassword;
    }

    public void setDeliveryManPassword(String deliveryManPassword) {
        this.deliveryManPassword = deliveryManPassword;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public DeliveryManTemplate(String deliveryManName, String deliveryManAddress, Long deliveryManContact, String deliveryManUsername, String deliveryManPassword, boolean available) {
        this.deliveryManName = deliveryManName;
        this.deliveryManAddress = deliveryManAddress;
        this.deliveryManContact = deliveryManContact;
        this.deliveryManUsername = deliveryManUsername;
        this.deliveryManPassword = deliveryManPassword;
        this.available = available;
    }

    @Override
    public String toString() {
        return "DeliveryMan{" + "deliveryManName=" + deliveryManName + ", deliveryManAddress=" + deliveryManAddress + ", deliveryManContact=" + deliveryManContact + ", deliveryManUsername=" + deliveryManUsername + ", deliveryManPassword=" + deliveryManPassword + ", available=" + available + '}';
    }
}
