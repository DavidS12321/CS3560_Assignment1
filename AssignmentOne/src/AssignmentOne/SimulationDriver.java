package AssignmentOne;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args) {

        Question singleChoiceQuestion = new SingleChoiceQuestion(
                "How are you feeling?",
                Arrays.asList("A. Good", "B. Bad", "C. Great", "D. Okay"),
                "C"
        );

        Question multipleChoiceQuestion = new MultipleChoiceQuestion(
                "What languages do you know?",
                Arrays.asList("A. Java", "B. C++", "C. Python", "D. C#"),
                Arrays.asList("B", "C")
        );

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            String studentID = "Student " + i;
            String answer = getRandomAnswer();
            students.add(new Student(studentID, answer));
        }

        VotingService singleChoiceVotingService = new VotingService(singleChoiceQuestion);
        VotingService multipleChoiceVotingService = new VotingService(multipleChoiceQuestion);

        for (Student student : students) {
            singleChoiceVotingService.acceptSubmission(student);
            multipleChoiceVotingService.acceptSubmission(student);
        }

        singleChoiceVotingService.displayResults();
        multipleChoiceVotingService.displayResults();
    }
    private static String getRandomAnswer() {
        String[] possibleAnswers = {"A", "B", "C", "D"};
        Random random = new Random();
        int randomIndex = random.nextInt(possibleAnswers.length);
        return possibleAnswers[randomIndex];
    }
}