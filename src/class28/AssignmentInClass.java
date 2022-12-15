package class28;

public class AssignmentInClass {
    public void printName(String name) {
        System.out.println(name);
    }

    public void printLastName(String lastName) {
        System.out.println(lastName);
    }
}

class AssignmentChild extends AssignmentInClass {
    public void printCitizenship(String citizenship) {
        System.out.println(citizenship);
    }
    public void printCountryOfBirth(String countryOfBirth) {
        System.out.println(countryOfBirth);
    }
}
