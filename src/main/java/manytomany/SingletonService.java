package manytomany;

import java.util.List;

public class SingletonService {

    public int listOfStudents(String type, List<Student> studentList){
        int count=0;
        for(Student s:studentList){
            //if(type==s.getLaptop().)
         count=   s.getLaptop().size();
        }
        return count;
    }
}
