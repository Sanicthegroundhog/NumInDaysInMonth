public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(2, -2020));
    }

    private static boolean isLeapYear(int year) {
        return div4Check(year);
    }

    private static boolean div4Check(int year) {
        if (year % 4 == 0) {
            return div100Check(year);
        } else {
            return false;
        }
    }

    private static boolean div100Check(int year) {
        if (year % 100 == 0) {
            return div400Check(year);

        } else {
            return true;
        }
    }

    private static boolean div400Check(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return -1;
        }
    }
}