import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoteService {

    private Question Question;

    private Map<String, List<String>> StudentAnswers;

    public VoteService(Question question) {
        this.Question = question;
        this.StudentAnswers = new HashMap<String, List<String>>();

    }

    public void SetAnswers(String StudentID, List<String> Answers) {
        this.StudentAnswers.put(StudentID, Answers);

    }

    public String GetStatistics() {
        Map<String, Integer> AnswerFrequency = new HashMap<String, Integer>();

        // for each loop
        for (List<String> Answers : this.StudentAnswers.values()) {
            // nested for loop
            for (String string : Answers) {
                if (AnswerFrequency.containsKey(string)) {

                    AnswerFrequency.put(string, AnswerFrequency.get(string) + 1);
                } else {
                    AnswerFrequency.put(string, 1);
                }

            }

        }

        return AnswerFrequency.toString();

    }

    public void PrintQuestions() {
        System.out.println(this.Question.GetQuestions());

    }

}
