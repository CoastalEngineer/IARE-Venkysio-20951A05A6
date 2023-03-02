import java.io.*;

public class stringReverseIteration {
    public static void main(String args[]) throws IOException {

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    try {
        String str = bufferedReader.readLine();
        String rev = "";

        for(int i=str.length()-1; i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);

        System.out.println(reverseRecurse(str)); //using recursion
        }
    catch(Exception e){
        System.out.println(e);
        }
    }
    public static String reverseRecurse(String str){
        if(str.length() == 0)
        return "";

        return str.charAt(str.length()-1)+ reverseRecurse(str.substring(0, str.length()-1));
    }
}


