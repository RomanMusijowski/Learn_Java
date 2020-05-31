package exceptions;

import javax.crypto.AEADBadTagException;
import java.io.IOException;

public class ArifException {
    public static void main(String[] args) {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("IOE1");
        } catch (Exception e) {
            System.out.println("Ex");
        }

        System.out.println("Fin");
    }
}
