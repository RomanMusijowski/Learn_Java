package exceptions;

import java.io.IOException;

public class WithReturn {
    public static void main(String[] args) {
//        try {
//            return;
//        }finally {
//            System.out.println("Finnaly");
//        }
        System.out.println(returnString());
    }

    private static String returnString() {
        try {
            return "TRY";
        }finally {
            return "FINALLY";
        }
    }

}
