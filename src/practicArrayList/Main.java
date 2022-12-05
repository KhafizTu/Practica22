package practicArrayList;

import colection.Colection;

import java.util.*;


public class Main {
    public static void main(String[] args) {



/**        Java 8 үчүн практикалык тапшырма */

//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Bishkek");
        strings.add("Osh");
        strings.add("Kara-Kol");
        strings.add("Balykchy");

        System.out.println("1: " + strings);

//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
        strings.add(1, "Naryn");
        System.out.println("2: " + strings);


//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
        System.out.println("3: " + strings.get(3));

//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        strings.set(2, "Cholpon-Ata");
        System.out.println("4: " + strings);

//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        strings.remove("Cholpon-Ata");
        System.out.println("5: " + strings);

//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.


        if (strings.contains("Balykchy")) {
            System.out.println("6: " + "Found the element");
        } else {
            System.out.println("6: " + "There is no such element");
        }


//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.

        ArrayList<String> list = new ArrayList<String>();

        list.add("Bishkek");
        list.add("Tash-Rabat");
        list.add("Cholpon-Ata");
        list.add("Karakol");
        list.add("Mailuu-Suu");
        list.add("At-Bashy");
        list.add("Naryn");
        list.add("Balykchy");

        System.out.println("Массив: " + list);
        Collections.sort(list);
        System.out.println("7: " + list);

//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.

        ArrayList<String> ALL2 = new ArrayList<>();
        ALL2.addAll(list);
        System.out.println("8: Original ArrayList : " + list);
        System.out.println("8: Copied ArrayList : " + ALL2);


//
//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.

        System.out.println("9: Оригинал: " + list);
        Collections.shuffle(list);
        System.out.println("9: Тескериси: " + list);



//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.


        System.out.println("10: Оригинал : " + list);
        Collections.reverse(list);
        System.out.println("10: Аралашкан: " + list);



//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз  */

        List<Integer> list2 = new ArrayList(list);
        System.out.println("11: " + "List: " + list2);

        List<Integer> subList = list2.subList(2, 6);
        System.out.println("11:" + "SubList: " + subList);


    }
}

