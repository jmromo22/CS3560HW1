import java.util.List;
import java.util.ArrayList;

public abstract class Question {
    private String Question;

    protected List<String> Choices;

    public Question() {this.Choices = new ArrayList<>();}

    
    // set all setters as void
    public void SetQuestions(String Question) {
        this.Question = Question;

    }

    // getters always return something
    public String GetQuestions() {
        return this.Question;

    }

    public abstract void SetChoices(List<String> Choices);
        
    

    public List<String> GetChoices() {
        return this.Choices;

    }

}
