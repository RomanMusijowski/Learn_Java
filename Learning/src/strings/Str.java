package strings;

public class Str {
    public static void main(String[] args) {
        String strObject = new String("origin");
        String strObjectCopy = new String("origin"); //heap
        String str2 = "origin";                    //string pool
        String str2Copy = "origin";

        StringBuffer buffer = new StringBuffer("origin");   //heap
//        StringBuffer buffer2 = "origin"; compilation error

        StringBuilder builder = new StringBuilder("origin");   //heap
//        StringBuilder builder2 = "origin";  compilation error

        System.out.println(strObject == strObjectCopy);//false
        System.out.println(strObject.equals(strObjectCopy));//true
        System.out.println();
        System.out.println(str2 == str2Copy);//true
        System.out.println(str2.equals(str2Copy));//true
        System.out.println();


        System.out.println(strObject==str2);   // (whether they are the same object).
        System.out.println(strObject.equals(str2));   //(whether they are logically "equal").
        System.out.println();

//        System.out.println(strObject==buffer);  compilation error
        System.out.println(strObject.equals(buffer));//false
        System.out.println(strObject.equals(builder));//false
        System.out.println();


        System.out.println(str2.equals(buffer));//false
        System.out.println(str2.equals(builder));//false

        System.out.println(buffer.equals(builder)); //false
    }
}
