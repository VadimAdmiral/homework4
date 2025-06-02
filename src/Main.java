public static void main(String[] args) {
    //Задача 1 ;
    int age = 16;
    if (age >= 18) {
        System.out.println(" Человек совершеннолетний ");
    } else {
        System.out.println("Если возраст человека равен " + age + ",то он не достиг совершеннолетия,нужно немного подождать.");
    }
    // Задача 2;
    int temperature = 15;
    if (temperature < 5) {
        System.out.println(" На улице " + temperature + " градусов, нужно надеть шапку .");
    } else {
        System.out.println(" На улице " + temperature + " градусов, можно идти без шапки .");
    }

    //Задача 3;
    int speed = 75;
    if (speed > 60) {
        System.out.println(" Если скорость " + speed + " , то придется заплатить штраф. ");
    } else {
        System.out.println(" Можно ездить спокойно");
    }

    //Задача 4 ;
    int year = 9;
    if (year >= 2 && year <= 6) {
        System.out.println(" Нужно ходить в детский сад");
    }
    if (year >= 7 && year <= 17) {
        System.out.println(" Если возраст человека равен" + year + ", то ему нужно ходить в школу.");
    }
    if (year >= 18 && year <= 24) {
        System.out.println("Если возраст человека равен" + year + " , то нужно ходить в университет .");
    }
    if (year > 24) {
        System.out.println(" Человеку пора ходить на работу.");
    }
    //задача 5;
    int yr = 13;
    boolean adult = true;
    if (yr < 5) {
        System.out.println(" Если возраст ребенка равен " + yr + " , то  ему нельзя кататься на аттракционе .");
    } else if (yr >= 5 && yr <= 14) {
        if (adult) {
            System.out.println(" Если возраст ребенка равен " + yr + " , то ему можно кататься на аттракционе в сопровождении взрослого. ");
        } else {
            System.out.println(" Если возраст ребенка равен " + yr + " , то ему можно кататься на аттракционе без сопровождения взрослого. ");
        }
        // Задача 6;
        int seat = 80;
        if (seat < 60) {
            System.out.println(" В вагоне есть сидячие и стоячие места");
        }else if (seat > 60 && seat < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println(" В вагоне нет мест");
        }

        // Задача 7;
        int one = 6;
        int two = 10;
        int three = 7;
        if (one > two && one > three) {
            System.out.println("Наибольшее число :" + one);
        } else if (two > three) {
            System.out.println(" Наибольшее число :" + two);
        } else {
            System.out.println("Наибольшее число : " + three);
        }
    }
}
