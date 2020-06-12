package Model;

import Util.StringUtil;

/**
 *
 * @author david
 */
public class Employee {
    
  private String firstName;
  private String lastName;
  private String middleName;
  private Identifier id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }
    
    public String fullName() {
        boolean hasMiddle = !StringUtil.isNullOrEmpty(this.middleName);

        String middleInitial = hasMiddle ? (this.middleName.charAt(0) + ". ") : "";

        return String.format("%s %s%s", this.firstName, middleInitial, this.lastName);

  }
    
}
