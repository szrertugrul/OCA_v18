package Q222;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q222 {
    public static void main(String[] args) {
        //          1st  yaziyo ama yazimi kabul etmedi
        List<String>lst= Arrays.asList("EN","FR","CH","FR");
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext()){
            String e=itr.next();
            if(e=="CH"){
                break;
            }
            System.out.println(e +" ");
        }
    }
    /*
    What is the result?
     A. EN FR JP
     B. EN FR
     C. CH
     D. EN FR CH
     Answer: B  --isteyen pdf te explanition a baksin
     */
}
