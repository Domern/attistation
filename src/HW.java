public class HW {
    // Задача №1
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }

    //Задача №2
    //    SELECT
    //    Person.firstName, Person.lastName, Address.city, Address.state
    //    FROM Person
    //    LEFT JOIN Address
    //    ON Person.personId = Address.personId;


    //Задача №3
    public String longestCommonPrefix(String[] strs) {
        String pref = "";
        String minStr = strs[0];
        boolean equals=true;
        for (String str : strs) {
            if (str.length() < minStr.length()) {
                minStr = str;
            }
        }
        for (int i = 0; i < minStr.length(); i++) {
            String sub = "";
            for (String str : strs) {
                sub = str.substring(i, i + 1);
                String b = minStr.substring(i, i + 1);
                if (!sub.equals(b)) {
                    equals = false;
                    break;
                }
            }
            if (equals) {
                pref = pref + sub;
            }
        }
        System.out.println(pref);
        return pref;
    }
}
