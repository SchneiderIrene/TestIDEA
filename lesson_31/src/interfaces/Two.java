package interfaces;

public class Two implements Serial, OurInterface{

    int value;

    public Two() {
        value = 0;
    }

    @Override
    public int getNext() {
        return value+=2;
    }

    @Override
    public void reset() {
    value = 0;
    }
    public void setInit(int a){
    value = a;
    }

    public int  previos (){
        return value-2;
    }
}
