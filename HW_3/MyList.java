package OOP.HW_OOP.HW_3;

import java.util.Iterator;
        
        public class MyList<L> implements Iterable<L>{
        private Node<L> last = null;
        private Node<L> first = null;
        private int size = 0;
    
        public MyList<L> add(L data) {
            Node<L> element = new Node<>(data);
            if (size == 0) {
                first = element;
            } else {
                last.setNext(element);
            }
            last = element;
            size++;
            return this;
        }
    
        @Override
        public Iterator<L> iterator() {
            return new ListIterator();
        }
    
        private class ListIterator implements Iterator<L> {
            private Node<L> currentNode = first;
    
            @Override
            public boolean hasNext() {
                return currentNode != null;
            }
    
            @Override
            public L next() {
                L data = currentNode.getData();
                currentNode = currentNode.getNext();
                return data;
            }
        }
    
        private class Node<L> {
            L data;
            Node<L> next;
        
            Node(L data) {
                this.data = data;
            }
            public L getData() {
                return this.data;
            }
            public Node<L> getNext() {
                return this.next;
            }
            public void setNext(Node<L> next) {
                this.next = next;
            }
        }
    }

