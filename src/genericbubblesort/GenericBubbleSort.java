package genericbubblesort;

import java.util.Comparator;

/**
 *
 * @author lennardneuwirth
 */
public class GenericBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public static <E extends Comparable<E>> void bubbleSort(E[] list){
        boolean needNextPass = true;
        //Bubble sorts the list in ascending order.
        for(int i = 1; i < list.length && needNextPass; i++){
            needNextPass = false;
            for(int x = 0; x < list.length - i; x++){
                if(list[x].compareTo(list[x + 1]) > 1){
                    E temp = list[x];
                    list[x] = list[x + 1];
                    list[x + 1] = temp;
                } 
            }
        }
    }
    
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
        E temp;
        for(int i = 0; i < list.length; i++){
            for(int x = 1; x < list.length; x++){
                
            }
        }
        
        
    }
    
    
}
