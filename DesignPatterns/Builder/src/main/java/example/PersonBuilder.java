package example;

public class PersonBuilder {

    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder withName(String name) {
        this.person.setName(name);
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.person.setAge(age);
        return this;
    }

    public PersonBuilder withAddress(Integer number, String city, String country) {
        Address address = new Address();
        address.setNumber(number);
        address.setCity(city);
        address.setCountry(country);
        this.person.setAddress(address);
        return this;
    }

    public Person build(){
        return this.person;
}
}
