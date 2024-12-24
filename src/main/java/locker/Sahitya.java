package locker;

import org.springframework.beans.factory.annotation.Autowired;

public class Sahitya {

   @Autowired
    public Pravallika pravallika;

    public void returnLocker(){
        pravallika.print();

    }
}
