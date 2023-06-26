package com.genpact.copilot.userregistration.model;

// Create class for Customer with all fields and default constructor.
// Create the default getters and setters for all the fields.
// Create a toString() method.
// Create equals method
// Create hashCode method
// Create a method to return the customer object as a JSON string.


public class Customer {

    public long customerId;
    public String customerName;
    public String customerPassword;
    public String customerEmail;
    public String customerPhone;
    public String customerAddress;
    public String customerDOB;
    public String customerGender;
    public String customerRole;

    public Customer() {
    }

    public Customer(long customerId, String customerName, String customerPassword, String customerEmail,
                String customerPhone, String customerAddress, String customerDOB, String customerGender, String customerRole) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerDOB = customerDOB;
        this.customerGender = customerGender;
        this.customerRole = customerRole;
    }

    @Override
    public String toString() {
        return "User [customerId=" + customerId + ", customerName=" + customerName + ", customerPassword=" + customerPassword
                + ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress
                + ", customerDOB=" + customerDOB + ", customerGender=" + customerGender + ", customerRole=" + customerRole + "]";
    }

}
