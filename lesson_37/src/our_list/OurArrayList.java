package our_list;

public class OurArrayList<E> implements OurList<E>{

    private Object [] source;
    private static final int INITIAL_CAPACITY = 16;
    private int size;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(E value) {
    if (source.length == size){
        enlargeArray();
    }
    source[size] = value;
    size++;
    }
    private void enlargeArray(){
        E[]newSource = (E[]) new Object[source.length*2];
        for (int i = 0; i<source.length; i++){
            newSource[i] = (E)source[i];
        }
        source = newSource;

    }


    @Override
    public E get(int index) {
        if (index>=size || index<0){
            return null;
        }
        return (E)source[index];
    }

    @Override
    public void set(E value, int index) {
        if (index >= size || index < 0){
            return;
        }

    source[index] = value;
    }

    @Override
    public boolean remove(E value) {
        for (int i = 0; i<size; i++){
            if (source[i].equals(value)){
                removeByID(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E removeByID(int index) {
        if (index>=size || index<0){
            return null;
        }
       E result = (E)source[index];
        for (int i = index+1; i<size; i++){
            source[i-1] = source[i];
        }
        source[size-1] = null;
        size--;
        return result;
    }

    public void clear(){
        size = 0;
    }
}
