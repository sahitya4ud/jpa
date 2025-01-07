package lockersystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LockerService {
    @Autowired
    private Locker locker;


    //Assign locker to user
    public void assignLocker(User user,int lockerId){
        if("Free".equals(locker.getStatus())){
            locker.setLockerid(12);
            locker.setOwner("x");
            locker.setStatus("Occupied");
            System.out.println("Locker"+lockerId+"Assigned to user"+user.getName());

        }else{
            System.out.println("Locker is occupied");
        }

    }

    //Release a locker
    public void releaseLocker(int lockerId){
        if("Occupied".equals(locker.getStatus())){
            locker.setStatus("Free");
            locker.setOwner("null");
            System.out.println("Locker"+lockerId+"Release locker");
        }else{
            System.out.println("Locker is not valid");
        }



    }
}
