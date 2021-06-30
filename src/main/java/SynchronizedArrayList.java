import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
// we can Synchronized ArrayList using below two ways
public class SynchronizedArrayList {
    public static void main(String[] args){

        //1. Collections.sysnchronizedList

        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        // for add, remove we dont need explicit synchronized method
        // but to fetch/travese we use explicit synchronized method

        synchronized (list){
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        //2. copyOnWriteArrayList
        //we dont need explicit synchronized method

        CopyOnWriteArrayList<String> arrlist = new CopyOnWriteArrayList<String>();
        arrlist.add("Sandy");
        arrlist.add("Sandip");
        arrlist.add("Gandharwar");

        Iterator<String> it = arrlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
