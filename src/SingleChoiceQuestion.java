import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SingleChoiceQuestion extends Question {

    @Override
    public void SetChoices(List<String> Choices) {
        
        List<String> Temp = new ArrayList<>();
        Temp.add(Choices.get(0));
        this.Choices = Temp;
    }
    
}
