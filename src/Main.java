public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 4");
        System.out.println("Task 1 ");
       int age =18;
       if ( age >=18) {
           System.out.println("Поздровляем пользователя с совершеннолетием");
       }
       if (age <18) {
            System.out.println("возраст совершеннолетия ещё не наступил");
        }
        System.out.println("Task2");

        int ageChild = 224;
        if (ageChild >=7 && ageChild <18) {
        System.out.println("ребенок ходит в школу");}


        if (ageChild >=18 && ageChild < 24) {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }
        if (ageChild >= 24) {
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("Task3");

        int carCapacity = 104;
        if (carCapacity > 102) {
            System.out.println("Мест нету");
        }
        if (carCapacity <=60) {
            System.out.println("Есть сидячие места");
        }
        if (carCapacity >= 60 && carCapacity <102) {
            System.out.println("Оставлись только стоячие места");
        }
            System.out.println("Task4");


    }
}