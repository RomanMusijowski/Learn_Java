package asseco;

public class TestAsseco {
    public static void main(String[] args) {
        System.out.println(solution("23A84Q", "K2Q25J"));
    }

    public static int solution(String A, String B) {
        int alexWin = 0;
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();
        int[] charsAInt =new int[charsA.length];
        int[] charsBInt =new int[charsB.length];


        for (int i = 0; i < charsA.length; i++) {
            if (Character.isLetter(charsA[i])){
                charsAInt[i] = returnNumber(charsA[i]);
                continue;
            }
            charsAInt[i] = Integer.parseInt(String.valueOf(charsA[i]));
        }
        for (int i = 0; i < charsB.length; i++) {
            if (Character.isLetter(charsB[i])){
                charsBInt[i] = returnNumber(charsB[i]);
                continue;
            }
            charsBInt[i] = Integer.parseInt(String.valueOf(charsB[i]));
        }

        for (int i = charsA.length - 1; i >= 0; i--) {

            int a = charsAInt[i];
            int b = charsBInt[i];
            int r = a - b;
            if (r > 0) {
                alexWin++;
            }

        }
        return alexWin;
    }

    static int returnNumber(char card){
        switch (card){
            case 'A':
                return 14;
            case 'K':
                return 13;
            case 'Q':
                return 12;
            case 'J':
                return 11;
            case 'T':
                return 10;
            default:
                return 0;
        }
    }
}




