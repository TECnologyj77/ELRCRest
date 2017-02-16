package hello;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Greg on 2/15/2017.
 */
public class User {

    private String firstName;

    private String lastName;

    public User(){}

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
