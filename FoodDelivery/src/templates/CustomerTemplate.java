/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templates;

/**
 *
 * @author viveksharma
 */
public class CustomerTemplate {
    private String customerName;
    private String customerAddress;
    private Long customerContact;
    private String customerUsername;
    private String customerPassword;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Long getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(Long customerContact) {
        this.customerContact = customerContact;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public CustomerTemplate(String customerName, String customerAddress, Long customerContact, String customerUsername, String customerPassword) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;
        this.customerUsername = customerUsername;
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerName=" + customerName + ", customerAddress=" + customerAddress + ", customerContact=" + customerContact + ", customerUsername=" + customerUsername + ", customerPassword=" + customerPassword + '}';
    }
}
