import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class SimulationDriver {
    public static void main(String[] args) throws Exception {
        //Question question = new SingleChoiceQuestion();
        Question question = new MultipleChoiceQuestion();
        VoteService votingService = new VoteService(question);
        Student[] students = new Student[10];

        question.SetQuestions("Why is Computer Science so difficult?");
        question.SetChoices(Arrays.asList("a", "b", "c", "d", "e"));

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            GenerateAnswers(question, students[i]);
            votingService.SetAnswers(students[i].GetID(), students[i].GetAnswers());

        }

        System.out.println(votingService.GetStatistics());

    }

    public static void GenerateAnswers(Question Q, Student s) {
        List<String> Choices = Q.GetChoices();

        if (Q.getClass() == SingleChoiceQuestion.class) {
            s.SetAnswers(Arrays.asList(Choices.get(0)));
        } else {
            s.SetAnswers(Choices.subList(0, new Random().nextInt(Choices.size())));
        }

    }

}
