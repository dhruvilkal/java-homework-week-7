package javahomeworkweek7;

public class Person {
    // Declare three instance variables
    String firstName;
    String lastName;
    int age;

    // Write the Instance method

    // 1st method getFirstName
    public String getFirstName() {
        return firstName;
    }

    // 2nd method getLastName
    public String getLastName() {
        return lastName;
    }

    // 3rd method getAge
    public int getAge() {
        return age;
    }

    // 1st method setFirstName with one parameter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // 2nd method setLastName with one parameter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // 3rd method setAge with age between 1 to 100
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;

        }
    }

    // 4th Teen without any parameters
    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    // Method named getFullName without any parameters
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else if (firstName.isEmpty()) {
            return firstName;

        } else if (lastName.isEmpty()) {
            return lastName;

        } else {
            return firstName + " " + lastName;
        }
    }


    // TEST CODE INTO MAIN METHOD//
    public static void main(String[] args) {
        Person person = new Person();
        // firstName is set to empty
        person.setFirstName(" ");
        // lastName is set to empty
        person.setLastName("");
        //age is set 10
        person.setAge(10);
        //print fullName
        System.out.println("fullName=" + person.getFullName());
        // print teen
        System.out.println("teen=" + person.isTeen());

        // firstName is set to John
        person.setFirstName("John");
        //age is 18
        person.setAge(18);

        System.out.println("fullName" + person.getFullName());
        System.out.println("teen=" + person.isTeen());

        //lastName is set to Smith
        person.setLastName("Smith");
        System.out.println("fullName=" + person.getFullName());

    }

}
