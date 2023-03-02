import java.io.*;

public class stringReversalUsingRecursion {

    public static String reverseStringRecurse(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverseStringRecurse(str.substring(1))+ str.charAt(0); //recursively reverses String
    }

    public static void main(String args[]) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try{
            String[] str = bufferedReader.readLine().split(" "); //splitting string based on whitespace
            String newReversedString = "";

            for(String string : str){ //shorthand iterable approach
                newReversedString += reverseStringRecurse(string) + " ";
            }

            System.out.println(newReversedString.trim()); //removes any extra whitespace at the end
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
