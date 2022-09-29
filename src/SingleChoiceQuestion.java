import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleChoiceQuestion extends Question {

    @Override
    public void SetChoices(List<String> Choices) {
        for (String string : Choices) {
            if (Choices.size() >= 2) {
                this.Choices.remove(string);
            }
        }

        this.Choices = Choices;
    }
    
}
