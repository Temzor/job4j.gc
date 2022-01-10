package ru.job4j.gc;

public class User {
    private final String name;
    private final String surname;
    private final String patronymic;
    private final int age;

    public User(String name, String surname, String patronymic, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
    }

    @Override
    protected void finalize() {
        System.out.printf("Removed %d %s%n", age, name);
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", patronymic='" + patronymic + '\''
                + ", age=" + age
                + '}';
    }

    public static void main(String[] args) {
        GCDemo.info();
        for (int i = 0; i < 1_000_0; i++) {
            new User("Имя № " + i, "Фамилия № " + i, "Отчество № " + i, i);
        }
        GCDemo.info();
    }
}
