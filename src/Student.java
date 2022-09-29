import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Student {
    private String ID; 
    private List<String> answers; 


    public Student() {
        this.ID = UUID.randomUUID().toString();
        this.answers = new LinkedList<String>();
        
    }

    public String GetID() {
        return this.ID;
         
    }
    public void SetAnswers(List<String>Answers) {
        this.answers.addAll(Answers);

    }
    public List<String> GetAnswers() {
        return this.answers;


    }

    
}
