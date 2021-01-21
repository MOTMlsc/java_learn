import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 删除数组中的奇数（主要考察迭代器的使用）
public class removeOdd {
    private static List<Integer> arr = null;
    public static void main(String[] args) {
        arr = new ArrayList<Integer>();

        for(int i=1; i<=100; i++) arr.add(i);
        Collections.shuffle(arr);

        func1();    //迭代器
        func2();    //精简版
        func3();    //普通for

        System.out.println(arr);
    }

    public static void func1(){
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            int tmp = it.next();
            if(tmp%2 == 1){
                it.remove();
            }
        }
    }

    public static void func2(){
        arr.removeIf(tmp -> tmp % 2 == 1);
    }

    public static void func3(){
        for(int i=0; i<arr.size();){
            if(arr.get(i)%2==1){
                arr.remove(i);
            }
            else i++;
        }
    }
}
