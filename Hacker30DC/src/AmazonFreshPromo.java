import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */

    public static int foo(List<String> codeList, List<String> shoppingCart) {
    	
    	String[] codeArray=new String[codeList.size()];
    	codeArray=codeList.toArray(codeArray);
    	
    	 String[] shoopingCartArray=new String[shoppingCart.size()];
    	 shoopingCartArray=shoppingCart.toArray(shoopingCartArray);
    // Write your code here
int cartIdx = 0, codeIdx = 0;
        while (cartIdx < shoppingCart.length && codeIdx < codeArray.length) {
            String cur = shoopingCartArray[cartIdx];
//            If the first fruit of the codeList is anything or if it matches the current fruit at the cart idx.
            if((codeArray[codeIdx][0].equals("anything") || codeArray[codeIdx][0].equals(cur)) && hasOrder(shoppingCart, cartIdx, codeList[codeIdx])){
                cartIdx += codeArray[codeIdx++].length;
            }else{
                cartIdx++;
            }
        }
//        If the all the codeList is present then return 1, else 0.
        return codeIdx == codeArray.length ? 1 : 0;
    }

    private static boolean hasOrder(String[] shoppingCart, int idx, String[] order) {
//        Loop through the codeList to check if the fruits are in order.
        for (String s : order) {
            if (idx < shoppingCart.length && (s.equals("anything") || shoppingCart[idx].equals(s))){
                idx++;
            }else{
                return false;
            }
        }
        return true;
    }

}

public class AmazonFreshPromo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int codeListCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> codeList = IntStream.range(0, codeListCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int shoppingCartCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> shoppingCart = IntStream.range(0, shoppingCartCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.foo(codeList, shoppingCart);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
