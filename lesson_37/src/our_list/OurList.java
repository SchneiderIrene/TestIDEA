package our_list;

public interface OurList<E> {

 void append(E o);
 E get (int index);
 void set (E o, int index);
 int size();
 boolean remove (E o);
 E removeByID(int index);
 void clear();



}
