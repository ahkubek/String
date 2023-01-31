public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println();
        System.out.println("ZADACHA1");
        String firstName = "Ivan";
        String middleName    = "Ivanich";
        String lastName  = "Ivanov";
        String fullName   = "Ivanov Ivan Ivanovich";
        System.out.println("ФИО СОТРУДНИКА"+ fullName);
        //TASK2
        System.out.println();
        
        System.out.println("ZADACHA2");
        String small = "Ivanov Ivan Ivanovich";
        System.out.println(small.toUpperCase());
        //Task3
        System.out.println();
        System.out.println("Задача3");

        fullName = "Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);




    }
}