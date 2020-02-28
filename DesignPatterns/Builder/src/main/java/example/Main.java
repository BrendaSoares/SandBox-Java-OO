package example;

public class Main {

    public static void main(String[] args){
        Person person = PersonBuilder.builder()
                .withName("Brenda")
                .withAge(19)
                .withAddress(19, "Cachoeirinha", "BR")
                .build();

        System.out.println(person);
    }
}
