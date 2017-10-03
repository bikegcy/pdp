
/**
 * created by xwenfei on 9/28
 */

import java.util.*;

public class MyPriorityQueue<T extends Comparable<T>>{

    public ArrayList<T> PQ;

    /**
     * Empty constructor
     */
    public MyPriorityQueue(){
        PQ = new ArrayList<T>();
    }

    /**
     * insert() inserts an patient in the queue.
     */
    public void insert(T e) {
        if (e == null) {
            throw new IllegalArgumentException("item to be inserted is null");
        } else {
            PQ.add(e);
            PQ.sort(new Comparator<T>(){
                public int compare(T e1, T e2) {
                    return e1.compareTo(e2);
                }
            });
        }
    }

    /**
     *  remove() removes the first item from the queue.  If the
     *  list is empty, do nothing.
     */
    public T remove(){
        if (PQ == null) {
            return null;
        }
        else{
            T removed = PQ.get(0);
            PQ.remove(0);
            return removed;
        }
    }

    /**
     *  front() returns the first item from the queue.  If the
     *  list is empty, do nothing.
     */
    public T front(){
        if(PQ == null){
            return null;
        }else{
            return PQ.get(0);
        }
    }

    /**
     *  isEmpty() returns if the queue is empty.  If the
     *  list is empty, return true, else return false.
     */
    public boolean isEmpty(){
        return PQ.isEmpty();
    }

    /**
     *
     * @return the priority list in forward order
     */
    public ArrayList testForwardTraversal(){
        if(PQ == null){
            throw new NoSuchElementException("the queue is empty");
        }else{
            return this.PQ;
        }

    }

    /**
     * @return the reversed priority
     */
    public  ArrayList testReverseTraversal()throws Exception{
        if(PQ == null){
            throw new NoSuchElementException("the queue is empty");
        }else{
            int num = PQ.size() - 1;
            ArrayList<T> reverseT = new ArrayList<T>();
            while(num >= 0){
                reverseT.add(PQ.get(num));
                num--;
            }
            return reverseT;
        }
    }
}

