import java.util.Scanner;

class Test {
    public static String[] odrID = new String[0];
    public static String[] phoneNo = new String[0];
    public static String[] tSizes = new String[0];
    public static String[] odrStatus = new String[0];
    public static int[] qt = new int[0];
    public static int[] countArr = new int[0];
    public static int[] noCountArr = new int[0];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        String tshirtSize;
        int qty;
        String orderID;
        String status;
        String mainHeader = "\r\n" +
                " /$$$$$$$$          " +
                "       /$$       /$$" +
                "                    " +
                "        /$$$$$$  /$$" +
                "                    " +
                "      \r\n" +
                "| $$_____/          " +
                "      | $$      |__/" +
                "                    " +
                "       /$$__  $$| $$" +
                "                    " +
                "      \r\n" +
                "| $$    /$$$$$$   /$" +
                "$$$$$$| $$$$$$$  /$$" +
                "  /$$$$$$  /$$$$$$$ " +
                "      | $$  \\__/| $" +
                "$$$$$$   /$$$$$$   /" +
                "$$$$$$ \r\n" +
                "| $$$$$|____  $$ /$$" +
                "_____/| $$__  $$| $$" +
                " /$$__  $$| $$__  $$" +
                "      |  $$$$$$ | $$" +
                "__  $$ /$$__  $$ /$$" +
                "__  $$\r\n" +
                "| $$__/ /$$$$$$$|  $" +
                "$$$$$ | $$  \\ $$| $" +
                "$| $$  \\ $$| $$  \\" +
                " $$       \\____  $$" +
                "| $$  \\ $$| $$  \\ " +
                "$$| $$  \\ $$\r\n" +
                "| $$   /$$__  $$ \\_" +
                "___  $$| $$  | $$| $" +
                "$| $$  | $$| $$  | $" +
                "$       /$$  \\ $$| " +
                "$$  | $$| $$  | $$| " +
                "$$  | $$\r\n" +
                "| $$  |  $$$$$$$ /$$" +
                "$$$$$/| $$  | $$| $$" +
                "|  $$$$$$/| $$  | $$" +
                "      |  $$$$$$/| $$" +
                "  | $$|  $$$$$$/| $$" +
                "$$$$$/\r\n" +
                "|__/   \\_______/|__" +
                "_____/ |__/  |__/|__" +
                "/ \\______/ |__/  |_" +
                "_/       \\______/ |" +
                "__/  |__/ \\______/ " +
                "| $$____/ \r\n" +
                "                    " +
                "                    " +
                "                    " +
                "                    " +
                "                | $$" +
                "      \r\n" +
                "                    " +
                "                    " +
                "                    " +
                "                    " +
                "                | $$" +
                "      \r\n" +
                "                    " +
                "                    " +
                "                    " +
                "                    " +
                "                |__/" +
                "      \r\n";

        L1: do {
            clearConsole();
            System.out.println(mainHeader);
            System.out.println(
                    "__________________________________________________________________________________________________________\n");

            System.out.println("\t\t\t[1] Place Order\t\t\t[2] Search Customer");
            System.out.println("\t\t\t[3] Search Order\t\t[4] View Reports");
            System.out.println("\t\t\t[5] Change OrderStatus\t\t[6] Delete Reports");

            System.out.print("\n\t\t\tInput Option : ");
            int mainMenuNum = input.nextInt();
            if (mainMenuNum == 1) {
                int count = 1;
                M1L1: do {
                    String padded = String.format("%05d", count);
                    orderID = "ODR#" + padded;
                    clearConsole();
                    String placeOrderHeader = "\r\n" +
                            "  _____  _          " +
                            "         ____       " +
                            "   _           \r\n" +
                            " |  __ \\| |        " +
                            "         / __ \\    " +
                            "    | |          \r" +
                            "\n" +
                            " | |__) | | __ _  __" +
                            "_ ___  | |  | |_ __ " +
                            "__| | ___ _ __ \r\n" +
                            " |  ___/| |/ _` |/ _" +
                            "_/ _ \\ | |  | | \'_" +
                            "_/ _` |/ _ \\ \'__|" +
                            "\r\n" +
                            " | |    | | (_| | (_" +
                            "|  __/ | |__| | | | " +
                            "(_| |  __/ |   \r\n" +
                            " |_|    |_|\\__,_|\\" +
                            "___\\___|  \\____/|_" +
                            "|  \\__,_|\\___|_|  " +
                            " \r\n";

                    System.out.println(placeOrderHeader);
                    System.out.println("_______________________________________________________");

                    System.out.println("\nEnter Order ID\t\t\t\t:\t" + orderID);
                    I1: do {
                        System.out.print("Enter Customer Phone Number \t\t:\t");
                        phoneNumber = input.next();
                        if (phoneNumber.startsWith("0") && phoneNumber.length() == 10) {
                            break;
                        } else {
                            System.out.println("\tInvalid Phone Number..... Try Again");
                            System.out.print("Do you want to enter phone number again ? (y/n) : ");
                            String checkStr = input.next();
                            if (checkStr.equalsIgnoreCase("y")) {
                                // Move the cursor up 3 lines
                                System.out.print("\033[3A");
                                // Clear the lines
                                System.out.print("\033[0J");
                                continue I1;
                            } else {
                                continue L1;
                            }
                        }
                    } while (true);
                    I2: do {
                        System.out.print("Enter T-Shirt Size (XS/S/M/L/XL/XXL)\t:\t");
                        tshirtSize = input.next();

                        if (tshirtSize.equalsIgnoreCase("xs") || tshirtSize.equalsIgnoreCase("s") ||
                                tshirtSize.equalsIgnoreCase("m") || tshirtSize.equalsIgnoreCase("l")
                                || tshirtSize.equalsIgnoreCase("xl") ||
                                tshirtSize.equalsIgnoreCase("xxl")) {
                            break;
                        } else {
                            // Move the cursor up 3 lines
                            System.out.print("\033[1A");
                            // Clear the lines
                            System.out.print("\033[0J");
                            continue I2;
                        }
                    } while (true);
                    I3: do {
                        System.out.print("Enter QTY\t\t\t\t:\t");
                        qty = input.nextInt();
                        if (qty == 0) {
                            continue I3;
                        } else {
                            break;
                        }
                    } while (true);
                    System.out.println("Amount\t\t\t\t\t:\t" + calculateAmount(tshirtSize, qty));
                    I4: do {
                        System.out.print("Do you want to place this order? (y/n) : ");
                        String verifyOrderPlace = input.next();
                        if (verifyOrderPlace.equalsIgnoreCase("y")) {
                            odrID = increaseStrArraySize(odrID);
                            odrID[count - 1] = orderID;
                            phoneNo = increaseStrArraySize(phoneNo);
                            phoneNo[count - 1] = phoneNumber;
                            tSizes = increaseStrArraySize(tSizes);
                            tSizes[count - 1] = tshirtSize;
                            qt = increaseIntArraySize(qt);
                            qt[count - 1] = qty;
                            odrStatus = increaseStrArraySize(odrStatus);
                            odrStatus[count - 1] = "Processing";
                            System.out.println("\tOrder Placed..!");

                            System.out.print("Do you want to place another order? (y/n) : ");
                            String anotherOrderPlace = input.next();
                            if (anotherOrderPlace.equalsIgnoreCase("y")) {
                                count++;
                                continue M1L1;
                            } else {
                                clearConsole();
                                continue L1;
                            }
                        } else {
                            System.out.print("Do you want to place another order? (y/n) : ");
                            String anotherOrderPlace = input.next();
                            if (anotherOrderPlace.equalsIgnoreCase("y")) {
                                continue M1L1;
                            } else {
                                clearConsole();
                                continue L1;
                            }
                        }
                    } while (true);
                } while (true);

            } else if (mainMenuNum == 2) {
                do {
                    clearConsole();
                    String searchCustomerHeader = "\r\n" +
                            "   _____            " +
                            "         _        __" +
                            "___          _      " +
                            "                    " +
                            "  \r\n" +
                            "  / ____|           " +
                            "        | |      / _" +
                            "___|        | |     " +
                            "                    " +
                            "  \r\n" +
                            " | (___   ___  __ _ " +
                            "_ __ ___| |__   | | " +
                            "   _   _ ___| |_ ___" +
                            "  _ __ ___   ___ _ _" +
                            "_ \r\n" +
                            "  \\___ \\ / _ \\/ _" +
                            "` | \'__/ __| \'_ \\" +
                            "  | |   | | | / __| " +
                            "__/ _ \\| \'_ ` _ \\" +
                            " / _ \\ \'__|\r\n" +
                            "  ____) |  __/ (_| |" +
                            " | | (__| | | | | |_" +
                            "__| |_| \\__ \\ || (" +
                            "_) | | | | | |  __/ " +
                            "|   \r\n" +
                            " |_____/ \\___|\\__," +
                            "_|_|  \\___|_| |_|  " +
                            "\\_____\\__,_|___/\\" +
                            "__\\___/|_| |_| |_|" +
                            "\\___|_|   ";

                    J1: do {
                        clearConsole();
                        System.out.println(searchCustomerHeader);
                        System.out.println(
                                "_________________________________________________________________________________");

                        System.out.print("Enter Customer Phone Number \t\t:\t");
                        phoneNumber = input.next();

                        int cnt = 1;
                        int nCnt = 1;
                        if (phoneNumber.startsWith("0") && phoneNumber.length() == 10) {

                            for (int i = 0; i < phoneNo.length; i++) {
                                if (!(phoneNo[i].contains(phoneNumber))) {
                                    noCountArr = increaseIntArraySize(noCountArr);
                                    noCountArr[nCnt - 1] = i;
                                    nCnt++;
                                } else {
                                    if (phoneNo[i].equals(phoneNumber)) {
                                        countArr = increaseIntArraySize(countArr);
                                        countArr[cnt - 1] = i;
                                        cnt++;
                                    }
                                }

                            }
                            if (phoneNo.length == noCountArr.length) {
                                System.out.println("\tInvalid Phone Number..... Try Again");
                                System.out.print("Do you want to search phone number again ? (y/n) : ");
                                String checkStr = input.next();
                                if (checkStr.equalsIgnoreCase("y")) {
                                    continue J1;
                                } else {
                                    continue L1;
                                }
                            }

                        } else {
                            System.out.println("\tInvalid Phone Number..... Try Again");
                            System.out.print("Do you want to search phone number again ? (y/n) : ");
                            String checkStr = input.next();
                            if (checkStr.equalsIgnoreCase("y")) {
                                // Move the cursor up 3 lines
                                System.out.print("\033[3A");
                                // Clear the lines
                                System.out.print("\033[0J");
                                continue J1;
                            } else {
                                continue L1;
                            }
                        }

                        int S = 0, XS = 0, M = 0, L = 0, XL = 0, XXL = 0;

                        for (int i = 0; i < countArr.length; i++) {
                            tshirtSize = tSizes[countArr[i]];
                            qty = qt[countArr[i]];
                            if (tshirtSize.equalsIgnoreCase("S"))
                                S = S + qty;
                            else if (tshirtSize.equalsIgnoreCase("XS"))
                                XS = XS + qty;
                            else if (tshirtSize.equalsIgnoreCase("M"))
                                M = M + qty;
                            else if (tshirtSize.equalsIgnoreCase("L"))
                                L = L + qty;
                            else if (tshirtSize.equalsIgnoreCase("XL"))
                                XL = XL + qty;
                            else if (tshirtSize.equalsIgnoreCase("XXL"))
                                XXL = XXL + qty;
                        }
                        int totalAmount = calculateAmount("S", S) + calculateAmount("XS", XS) +
                                calculateAmount("M", M) + calculateAmount("L", L) + calculateAmount("XL", XL)
                                + calculateAmount("XXL", XXL);
                        System.out.println(
                                "+---------------+-------------------------------+-------------------------------+");
                        System.out.println("|\tSize\t|\t\tQty\t\t|\t\tAmount\t\t|");
                        System.out.println(
                                "+---------------+-------------------------------+-------------------------------+");
                        System.out.println("|\tS\t|\t\t" + S + "\t\t|\t\t" + calculateAmount("S", S) + "\t\t|");
                        System.out.println("|\tXS\t|\t\t" + XS + "\t\t|\t\t" + calculateAmount("XS", XS) + "\t\t|");
                        System.out.println("|\tM\t|\t\t" + M + "\t\t|\t\t" + calculateAmount("M", M) + "\t\t|");
                        System.out.println("|\tL\t|\t\t" + L + "\t\t|\t\t" + calculateAmount("L", L) + "\t\t|");
                        System.out.println("|\tXL\t|\t\t" + XL + "\t\t|\t\t" + calculateAmount("XL", XL) + "\t\t|");
                        System.out.println("|\tXXL\t|\t\t" + XXL + "\t\t|\t\t" + calculateAmount("XXL", XXL) + "\t\t|");
                        System.out.println(
                                "+-----------------------------------------------+-------------------------------+");
                        System.out.println("|\t\tTotal Amount\t\t\t|\t\t" + totalAmount + "\t\t|");
                        System.out.println(
                                "+-----------------------------------------------+-------------------------------+");

                        do {
                            System.out.print("Do you want to search another customer report ? (y/n) : ");
                            String checkReSearchPhone = input.next();
                            if (checkReSearchPhone.equalsIgnoreCase("y")) {
                                continue J1;
                            } else {
                                continue L1;
                            }
                        } while (true);
                    } while (true);
                } while (true);

            } else if (mainMenuNum == 3) {
                String searchOrderHeader = "\r\n" +
                        "   _____            " +
                        "         _        __" +
                        "__          _       " +
                        "    \r\n" +
                        "  / ____|           " +
                        "        | |      / _" +
                        "_ \\        | |     " +
                        "     \r\n" +
                        " | (___   ___  __ _ " +
                        "_ __ ___| |__   | | " +
                        " | |_ __ __| | ___ _" +
                        " __ \r\n" +
                        "  \\___ \\ / _ \\/ _" +
                        "` | \'__/ __| \'_ \\" +
                        "  | |  | | \'__/ _` " +
                        "|/ _ \\ \'__|\r\n" +
                        "  ____) |  __/ (_| |" +
                        " | | (__| | | | | |_" +
                        "_| | | | (_| |  __/ " +
                        "|   \r\n" +
                        " |_____/ \\___|\\__," +
                        "_|_|  \\___|_| |_|  " +
                        "\\____/|_|  \\__,_|" +
                        "\\___|_|   \r\n";

                K1: do {
                    clearConsole();
                    System.out.println(searchOrderHeader);
                    System.out.println(
                            "_________________________________________________________________________________");

                    System.out.print("Enter Order ID \t\t:\t");
                    orderID = input.next();

                    int position = 0;
                    int nCnt = 1;
                    noCountArr = new int[0];

                    for (int i = 0; i < odrID.length; i++) {
                        if (!(odrID[i].contains(orderID))) {
                            noCountArr = increaseIntArraySize(noCountArr);
                            noCountArr[nCnt - 1] = i;
                            nCnt++;
                        } else {
                            if (odrID[i].equalsIgnoreCase(orderID)) {
                                position = i;
                                break;
                            }
                        }

                    }
                    if (odrID.length == noCountArr.length) {
                        System.out.println("\tInvalid Order ID..... Try Again");
                        System.out.print("Do you want to search order ID again ? (y/n) : ");
                        String checkStr = input.next();
                        if (checkStr.equalsIgnoreCase("y")) {
                            continue K1;
                        } else {
                            continue L1;
                        }
                    }

                    phoneNumber = phoneNo[position];
                    tshirtSize = tSizes[position];
                    qty = qt[position];
                    int amount = calculateAmount(tshirtSize, qty);
                    status = odrStatus[position];

                    System.out.println("\nPhone Number\t:\t" + phoneNumber);
                    System.out.println("Size\t\t:\t" + tshirtSize);
                    System.out.println("QTY\t\t:\t" + qty);
                    System.out.println("Amount\t\t:\t" + amount);
                    System.out.println("Status\t\t:\t" + status);

                    do {
                        System.out.print("Do you want to search another order ? (y/n) : ");
                        String checkReSearchPhone = input.next();
                        if (checkReSearchPhone.equalsIgnoreCase("y")) {
                            continue K1;
                        } else {
                            continue L1;
                        }
                    } while (true);

                } while (true);

            } else if (mainMenuNum == 4) {

            } else if (mainMenuNum == 5) {

            } else if (mainMenuNum == 6) {

            } else {
                continue L1;
            }

        } while (true);

    }

    private static int calculateAmount(String tshirtSize, int qty) {
        if (tshirtSize.equalsIgnoreCase("xs")) {
            return 600 * qty;
        } else if (tshirtSize.equalsIgnoreCase("s")) {
            return 800 * qty;
        } else if (tshirtSize.equalsIgnoreCase("m")) {
            return 900 * qty;
        } else if (tshirtSize.equalsIgnoreCase("l")) {
            return 1000 * qty;
        } else if (tshirtSize.equalsIgnoreCase("xl")) {
            return 1100 * qty;
        } else {
            return 1200 * qty;
        }
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

    public static String[] increaseStrArraySize(String[] original) {
        String[] temp = new String[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            temp[i] = original[i];
        }
        original = temp;
        return original;
    }

    public static int[] increaseIntArraySize(int[] original) {
        int[] temp = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            temp[i] = original[i];
        }
        original = temp;
        return original;
    }
}