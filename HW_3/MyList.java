package OOP.HW_OOP.HW_3;

import java.util.Iterator;

public class MyList<E> implements Iterable<E> {
    /*Создать список по аналогии LinkedList (список связанных элементов),
     реализовать в нем iterable интерфейс. 
     Список должен содержать элементы со ссылкой на следующий элемент 
     (если показалось мало, то реализовать ссылку и на предыдущий элемент) */

    private Node<E> node = null;
    private int count = 0;
    
    private class MyListIterator implements Iterator<E>{
        private Node<E> current;
        private boolean isFirst = true;
        
        private MyListIterator(Node<E> node){
            current = node; 
        }
        
        @Override 
        public boolean hasNext(){
            if(count == 1 && isFirst){
                return true;
            }
            return current.isNext();
        }
        @Override
        public E next(){
            return current.get();
        }
        


    }

    public MyList(){
        node = new Node<>();
    }
    public int size(){
        return count;
    }

    public void add(E element){
        if(count == 0){
            node.set(element);
        }
        else{
            node.add(element);
        }
        count++;
    }
    

    @Override
    public Iterator<E> iterator(){
        return new MyListIterator(node);
    }
    /* 
    @Override
    public String toString(){
        return String.format("данные: ", node.get());
    }
    */
    private class Node<E>{
        private E element;
        private Node<E> next = null;

        Node(){}
        Node(E element){
            set(element);
        }
        boolean isNext(){
            return next != null;
        }
        E get(){
            return element;
        }

        void set(E element){
            this.element = element;
        }
        void add(E element){
            if(isNext()){
                next.add(element);
            }
            else{
                next = new Node<>(element);
            }
        
        
        } 
        
        



    }
    


}
