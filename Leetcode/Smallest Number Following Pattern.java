import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // code
    String ans="";
    Stack<Integer> st = new Stack<Integer>();
    int index = 0;
    int val = 1;
    
    while(index < str.length()){
        if(str.charAt(index) == 'd'){
//            System.out.println("pushed: " + );
            st.push(val);
            val++;
            index++;    
        }else{
//            System.out.println("pushed i: " + st.push(val));
            st.push(val);
            val++;
            int siz = st.size();
            for(int i=0; i<siz; i++){
                ans+= st.pop();
            }
            index++;
        }    
    }
    ans+=val;
    int siz = st.size();
    for(int i=0; i<siz; i++){
        ans+= st.pop();
    }
//    System.out.println(st);
    System.out.println(ans);
 }
}

// 54321 i i d d
// 54321 8 9 7 6