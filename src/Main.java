import java.io.*;

public class Main {

    public static void main(String[] args) {
        String[] textArray = null;
        try {
            textArray = readFromFile("xanadu.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        printArrayOfStrings(textArray);
        try {
            writeToFile("xanadu_copy.txt", textArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readFromFile(String filename) throws IOException {
        String[] arrayOfStrings = new String[100];
        int noOfStringsInArray = 0;

        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(filename));
            String l;
            while ((l = inputStream.readLine()) != null) {
                arrayOfStrings[noOfStringsInArray] = l;
                noOfStringsInArray++;
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return arrayOfStrings;
    }

    public static void printArrayOfStrings(String[] arrayOfStrings){
        if (arrayOfStrings != null) {
            for (int i = 0; i < arrayOfStrings.length; i++) {
                System.out.println(i + ": " + arrayOfStrings[i]);
            }
        }
    }

    public static void writeToFile(String filename, String[] arrayOfStrings) throws IOException {
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileWriter(filename));
            String l;
            for (int i = 0; i < arrayOfStrings.length; i++) {
                if (arrayOfStrings[i] != null) {
                    outputStream.println(arrayOfStrings[i]);
                }
            }
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
