/*Описати класи Man і Woman, що наслідують клас Person.
        Обидва класи мають властивості:
        firstName
        lastName
        age
        partner
        інші властивості, які ви вважаєте необхідними

        Обидва класи мають методи:
        конструктор, який включає всі поля
        сеттер і геттер на полі age, та інші властивості, де це необхідно
        isRetired (повертає true, якщо вік більше пенсійного порогу 60 для жінок та 65 для чоловіків)
        registerPartnership (мається на увазі, що дружина приймає прізвище чоловіка)
        deregisterPartnership (як вхідний параметр приймає boolean: повернення до попереднього прізвища)
 */

public class Main {
    public static void main(String[] args) {
        Man men1 = new Man("Ivan", "Ivanov", 33);
        Man men2 = new Man("Oleh", "Petrov", 65);
        Man men3 = new Man("Oleksandr", "Poliakov", 64);
        Woman women1 = new Woman("Anna", "Petrova", 25);
        Woman women2 = new Woman("Olha", "Kovalenko", 60);

        System.out.println("Пенсія");
        men1.isRetired();
        men2.isRetired();
        men3.isRetired();
        women1.isRetired();
        women2.isRetired();

        System.out.println("-------------------------------------------------------");

        System.out.println("Шлюб");
        women2.registerPartnership(men1);
        System.out.println(" Дівоче прізвище: " + women2.getMaidenName() + ".");

        men3.registerPartnership(women1);
        System.out.println(" Дівоче прізвище його дружини: " + women1.getMaidenName() + ".");

        System.out.println("-------------------------------------------------------");

        System.out.println("Розлучення");
        women1.deregisterPartnership(true);
        System.out.println();
        System.out.println(women1 + " Дівоче прізвище: " + women1.getMaidenName());
        System.out.println(men3);
        System.out.println("-------------------------------------------------------");

    }
}