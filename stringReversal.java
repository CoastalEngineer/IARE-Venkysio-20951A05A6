import java.io.*;

public class stringReversal {
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
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
