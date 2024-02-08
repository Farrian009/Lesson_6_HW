import java.util.*;

import static java.lang.Integer.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop lp1 = new Laptop();
        lp1.ram = 4;
        lp1.rom = 1024;
        lp1.typeHardDrive = "SSD";
        lp1.os = "Windows";
        lp1.color = "Red";
        lp1.screenSize = 24;
        lp1.manufacture = "Dell";
        lp1.price = 4000;

        Laptop lp2 = new Laptop(8,
                512,
                "HDD",
                "Windows",
                "Blue",
                27,
                "HP",
                6000);

        Laptop lp3 = new Laptop(4,
                1024,
                "HDD",
                "Windows",
                "Black",
                27,
                "Dell",
                5500);

        Laptop lp4 = new Laptop(16,
                2048,
                "SDD",
                "MacOS",
                "Blue",
                27,
                "Apple",
                4800);

        Laptop lp5 = new Laptop(16,
                1024,
                "SDD",
                "MacOS",
                "Red",
                15,
                "Apple",
                6100);

        laptops.add(lp1);
        laptops.add(lp2);
        laptops.add(lp3);
        laptops.add(lp4);
        laptops.add(lp5);

        searchLT(laptops, createListOfProperties(laptops));
        System.out.println();

    }

    public static void searchLT(Set<Laptop> laptops, HashMap<String, String> listOfProperties) {
        Set<Laptop> laptopsSorted = new HashSet<>();
        ArrayList<String> keys = new ArrayList<>(listOfProperties.keySet());
        for (Laptop l : laptops) {
            for (int i = 0; i < keys.size(); i++) {
                if (i == 0) {
                    if (keys.get(i).equals("os") && l.os.equals(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("typeHardDrive") && l.typeHardDrive.equals(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("color") && l.color.equals(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("manufacture") && l.getManufacture().equals(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("ram") && l.getRam() >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("rom") && l.rom >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("screenSize") && l.screenSize >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    } else if (keys.get(i).equals("price") && l.getPrice() <= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                        laptopsSorted.add(l);
                    }
                } else {
                    for (Laptop ls : laptopsSorted) {
                        if (keys.get(i).equals("os") && !ls.os.equals(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("typeHardDrive") && !ls.typeHardDrive.equals(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("color") && !ls.color.equals(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("manufacture") && !ls.getManufacture().equals(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("ram") && ls.getRam() >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("rom") && ls.rom >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("screenSize") && ls.screenSize >= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        } else if (keys.get(i).equals("price") && ls.getPrice() <= Integer.parseInt(listOfProperties.get(keys.get(i)))) {
                            laptopsSorted.remove(ls);
                        }
                    }

                }
            }





            for (String key : listOfProperties.keySet()) {



            }

        }

        System.out.println();
        for (Laptop l : laptopsSorted) {
            System.out.println(l);

        }
    }

    public static HashMap<String, String> createListOfProperties(Set<Laptop> laptops) {
        HashMap<String, String> listOfProperties = new HashMap<>();
//        Set<Laptop> searchedLaptops = new HashSet<>();
        Scanner sc1 = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Введите параметр для поиска:");
            System.out.println("1 - Объем оперативной памяти \n" +
                    "2 - Объем диска \n" +
                    "3 - Тип диска \n" +
                    "4 - Операционная система \n" +
                    "5 - Цвет \n" +
                    "6 - Размер экрана в дюймах \n" +
                    "7 - Производитель \n" +
                    "8 - Цена \n" +
                    "0 - Завершить поиск и вывести результаты");

            int searchCondition = sc1.nextInt();

            switch (searchCondition) {
                case 1:
                    System.out.println("Введите значение:");
                    listOfProperties.put("ram", sc1.next());
                    break;
                case 2:
                    System.out.println("Введите значение:");
                    listOfProperties.put("rom", sc1.next());
                    break;
                case 3:
                    System.out.println("Введите значение:");
                    listOfProperties.put("typeHardDrive", sc1.next());
                    break;
                case 4:
                    System.out.println("Введите значение:");
                    listOfProperties.put("os", sc1.next());
                    break;
                case 5:
                    System.out.println("Введите значение:");
                    listOfProperties.put("color", sc1.next());
                    break;
                case 6:
                    System.out.println("Введите значение:");
                    listOfProperties.put("screenSize", sc1.next());
                    break;
                case 7:
                    System.out.println("Введите значение:");
                    listOfProperties.put("manufacture", sc1.next());
                    break;
                case 8:
                    System.out.println("Введите значение:");
                    listOfProperties.put("price", sc1.next());
                    break;
                case 0:
                    flag = false;
                    System.out.println("Подобранные по параметрам ноутбуки");
                    break;
                default:
                    flag = false;
                    System.out.println("Некорректные параметры поиска. Попробуйте снова");
                    break;
            }
        }
        return listOfProperties;
    }
}
