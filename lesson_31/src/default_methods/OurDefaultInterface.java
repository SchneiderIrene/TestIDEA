package default_methods;

public interface OurDefaultInterface {
    int getUserID ();
    default int getAdminID(){
        return 26;
    }
}
