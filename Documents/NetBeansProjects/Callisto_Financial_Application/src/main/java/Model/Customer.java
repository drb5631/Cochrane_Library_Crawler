package Model;

import java.time.LocalDate;

/**
 * A class representing customer.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private String middleName;
    private Address address;
    private LocalDate birthday;
    private String phoneNumber;
    private Identifier id;

    /**
     * A constructor for creating a customer.
     *
     * @param id A customer ID
     * @param firstName A customer's first name.
     * @param lastName A customer's last name.
     * @param middleName A customer's middle name.
     * @param address A customer's address.
     * @param birthday A customer's birthday.
     * @param phoneNumber A customer's phone number.
     */
    public Customer(Identifier id, String firstName, String lastName, String middleName, String address, LocalDate birthday, String phoneNumber) {

    }

    /**
     * Returns a customer's first name.
     *
     * @return A string representing the customer's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets a customer's first name.
     *
     * @param firstName Sets the string representing the customer's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns a customer's last name.
     *
     * @return A string representing the customer's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets a customer's last name.
     *
     * @param lastName Sets the string representing the customer's last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns a customer's middle name.
     *
     * @return A string representing the customer's middle name.
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets a customer's middle name.
     *
     * @param middleName Sets the string representing the customer's middle
     * name.
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * Returns a customer's address.
     *
     * @return Address representing a customer's home address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets a customer's address.
     *
     * @param address Sets the string representing the customer's address.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Returns a customer's birthday.
     *
     * @return A LocalDate representing the customer's birthday.
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * Sets a customer's birthday.
     *
     * @param birthday Sets the string representing the customer's birthday.
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * Returns a customer's phone number.
     *
     * @return A string representing the customer's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets a customer's phone number.
     *
     * @param phoneNumber Sets the string representing the customer's phone
     * number.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a customer's ID.
     *
     * @return An Identifier representing the customer's ID.
     */
    public Identifier getId() {
        return id;
    }

    /**
     * Sets a customer's ID.
     *
     * @param id Sets the string representing the customer's ID.
     */
    public void setId(Identifier id) {
        this.id = id;
    }

    /**
     * Returns organized customer personal information.
     *
     * @return A string representing the street address of a customer.
     */
    @Override
    public String toString() {
        return String.format("%s|%s|%s|%s|%s|%s",
                this.firstName, this.middleName, this.lastName, this.address, this.birthday, this.phoneNumber);
    }
}
