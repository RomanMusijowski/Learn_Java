package algs.leet;

public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger integer = new StringToInteger();
//        System.out.println(integer.myAtoi("-91283472332"));
        System.out.println(integer.myAtoi("   -42"));
//        System.out.println(integer.myAtoi("4193 with words"));
//        System.out.println(integer.myAtoi("words and 987"));
    }

//return 0 if empty or contains whitespaces
//ret INT.MAx or INT.MIN if higher or lower
    //convert only if it begins from -/+ and digits

    public int myAtoi(String str) {
        if (str.isEmpty()
                || !Character.isDigit(str.charAt(0))
                || str.charAt(0) != '-'
                || str.charAt(0) != '+') {
            return 0;
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //if is +/- store, only once
            //if is a digit => store
            //any other chars => stope storing
            System.out.println("i="+ i);
            if(str.charAt(i) == '-' || str.charAt(i) == '+') {
                builder.append(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i))) {
                builder.append(str.charAt(i));
            } else if (str.charAt(i) == ' '){
                continue;
            }else {
                break;
            }
            System.out.println(builder);
        }


        boolean isDigit = Character.isDigit(builder.charAt(0));
        if (isDigit && builder.length() > 10) {
            return Integer.MAX_VALUE;
        } else if (!isDigit && builder.length() > 11) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(builder.toString());
    }
}
