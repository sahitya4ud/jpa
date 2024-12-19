package manytomany;

public class Singleton {
    public static SingletonService SingletonService;
    public static SingletonService getInstance(){
        if(SingletonService==null){
            SingletonService = new SingletonService();

        }
        return SingletonService;
    }
}
