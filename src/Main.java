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

        int carCapacity = 50;
        if (carCapacity <=60){
            System.out.println("Есть сидячие места");
        }
        else if (carCapacity >=60 && carCapacity <102){
            System.out.println("Осталось место только стоя");
        }
        else {
            System.out.println("Мест нету");
        }
        System.out.println("Домашнее задание 2");

        System.out.println("Task 1 ");

        int ageStudents =18;
        if (ageStudents >=2 && ageStudents <=6){
            System.out.println("Если возраст человека равен " + ageStudents + " то ему нужно ходить в детский сад");
        }
        else if (ageStudents >=7 && ageStudents <18){
            System.out.println("Если возраст человека равен " + ageStudents + " то ему нужно ходить в школу");
        }
        else if (ageStudents >=18 && ageStudents <24){
            System.out.println("Если возраст человека равен " + ageStudents + " то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + ageStudents + " то ему нужно ходить на работу");
        }

        System.out.println("Task 2 ");

        int ageChild = 25;
        if (ageChild <5){
            System.out.println("Ребенку нельзя кататься на атракционе");
        } else if (ageChild>=5 && ageChild <14) {
            System.out.println("Ребенок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("Челоек может кататься без сопровождения взрослого");
        }
        System.out.println("Task 3 ");
        int one = 9;
        int two = 2;
        int free = 3;

        if (one > two && one > free){
            System.out.println("Большое число " + one);
        } else if (two>one && two > free) {
            System.out.println("Большое число " + two);
        }
        else {
            System.out.println("Большое число " + free);
        }
    }
}
