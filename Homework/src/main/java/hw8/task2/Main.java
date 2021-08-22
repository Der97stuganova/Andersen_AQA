package hw8.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add(8905231, "Derstuganova");
        phonebook.add(3421986, "Vasileva");
        phonebook.add(2745310, "Kuzmina");
        phonebook.add(1122764, "Vasileva");
        phonebook.add(7755310, "Platonova");
        phonebook.add(5186739, "Kurepina");

        phonebook.get("Derstuganova");
        phonebook.get("Vasileva");
        phonebook.get("Kuzmina");
        phonebook.get("Platonova");
        phonebook.get("Kurepina");
    }
}
