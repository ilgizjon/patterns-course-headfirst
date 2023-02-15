package HeadFirst;

import java.util.*;

public class TestSyntaxJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<=5; i++){
            list.add(i);
        }

        int pos = 0;
        System.out.println(list.get(pos+1)!=null);

    }
}