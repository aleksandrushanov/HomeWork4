public class Main {
    public static void main(String[] args) {
        System.out.println("Home Work 4");
        System.out.println("Домашнее задание 2");
        System.out.println("Task 1 ");
      int age= 15;
      if (age >=18) {
          System.out.println("поздравляем пользователя с совершеннолетием");
      }
      else {
          System.out.println( "возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
      }
        System.out.println("Task 2");
        int childAge=21;
        if (childAge>=7 && childAge <18){
            System.out.println("ребенок ходит в школу");
        } else if (childAge >=18 && childAge <24)
        {
            System.out.println("человек уже закончил школу и может отправляться в университет");
        }else{
            System.out.println("человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Task3");

        int carCapacity = 130;
        if (carCapacity <=60){
            System.out.println("Есть сидячие места");
        }
        else if (carCapacity >=60 && carCapacity <102){
            System.out.println("Осталось место только стоя");
        }
        else {
            System.out.println("Мест нету");
        }



    }
}
