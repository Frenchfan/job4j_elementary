package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Hello, World!!!";
        } else if (number % 3 == 0) {
            return "Hello";
        } else if (number % 5 == 0) {
            return "World";
        } else {
            return "Operation not support";
        }
    }

    public static int calculate(int[] hours) {
        int regular = 10;
        int extrapay = 15;
        int doublepay = 20;
        int doubleextrapay = 30;
        int salary = 0;
        for (int i = 0; i < hours.length; i++) {
            salary += switch (i) {
                case 0, 1, 2, 3, 4 -> hours[i] > 8 ? (hours[i] - 8) * extrapay + 8 * regular : hours[i] * regular;
                case 5, 6 -> hours[i] > 8 ? (hours[i] - 8) * doubleextrapay + 8 * doublepay : hours[i] * doublepay;
                default -> 0;
            };
        }
        return salary;
    }

      public static boolean check(String left, String right) {

            return left.charAt(0) == right.charAt(0) || left.charAt(1) == right.charAt(1);

        }

        public static boolean check2(String l, String r) {
                return ("".equals(l) && "".equals(r)) || l.charAt(0) == r.charAt(r.length() - 1) && l.charAt(l.length() - 1) == r.charAt(0);
            }
        }


