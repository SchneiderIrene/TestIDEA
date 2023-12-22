package default_methods;

public interface OurDefaultInterface1 {
    int getUserID ();
    default int getAdminID(){
        return 122;
    }
}
