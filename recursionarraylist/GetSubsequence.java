package recursionarraylist;
import java.io.*;
import java.util.*;
public class GetSubsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            //System.out.println(bres);
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);//a
        String ros = str.substring(1);//bc  -c --
        ArrayList<String> rres = gss(ros);//[-- -c -b bc] Faith
        System.out.println(rres);
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr: rres){
            //System.out.println(rres);
            mres.add(rstr);
        }

        for(String rstr: rres){
            mres.add(ch + rstr);
        }
        return mres;
    }
}
