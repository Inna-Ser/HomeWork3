public class Main {
    public static void main(String[] args) {
        byte dinnerTable = 1;
        System.out.println("Значение переменной " + "dinnerTable " + "с типом " + "byte " + "равно " + dinnerTable);
        short armchair = 2;
        System.out.println("Значение переменной " + "armchair " + "с типом " + "short " + "равно " + armchair);
        int chair = 6;
        System.out.println("Значение переменной " + "chair " + "с типом " + "int " + "равно " + chair);
        long lamp = 10;
        System.out.println("Значение переменной " + "lamp " + "с типом " + "long " + "равно " + lamp);
        float sugar = 3.4f;
        System.out.println("Значение переменной " + "sugar " + "с типом " + "float " + "равно " + sugar);
        double pepper = 5.845897;
        System.out.println("Значение переменной " + "pepper " + "с типом " + "double " + "равно " + pepper);
        System.out.println("Exercise 2");
        float room = 27.12f;
        System.out.println(room);
        long number = 987678965549L;
        System.out.println(number);
        double dye = 2.786;
        System.out.println(dye);
        boolean roomSize = false;
        System.out.println(roomSize);
        int copperScrew = 569;
        System.out.println(copperScrew);
        short lakeDepth = -159;
        System.out.println(lakeDepth);
        short bookPages = 27897;
        System.out.println(bookPages);
        var window = 67;
        System.out.println(window);
        System.out.println("Exercise 3");
        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short totalPages = 480;
        int totalStudent = studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna;
        int pagesOneStudent = totalPages / totalStudent;
        System.out.println("На каждого ученика рассчитано " + pagesOneStudent + " листов бумаги.");
        System.out.println("Exercise 4");
        byte bottleOneMin = 16 / 2;
        int day = 1440;
        long timeWorkMachine = day * 3;
        int timeOut = 0;
        long makesMachine = bottleOneMin * (timeWorkMachine - timeOut);
        System.out.println("За 3 дня машина произвела бутылок " + makesMachine + " штук.");
    }
}
