package AssignmentOne;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
class VotingService {
    private Question question;
    private Map<String, Student> studentResponses = new HashMap<>();

    public VotingService(Question question) {
        this.question = question;
    }

    public void acceptSubmission(Student student) {
        studentResponses.put(student.getStudentID(), student);
    }

    public void displayResults() {
        System.out.println("Question: " + question.getQuestion());

        List<String> options = question.getOptions();
        for (String option : options) {
            System.out.println(option);
        }
        // Track student answers
        Map<String, String> studentAnswers = new HashMap<>();
        for (Student student : studentResponses.values()) {
            studentAnswers.put(student.getStudentID(), student.getResponse());
        }

        int correctCount = 0;

        // Display student answers
        for (String studentID : studentAnswers.keySet()) {
            String answer = studentAnswers.get(studentID);
            System.out.println(studentID + " chose: " + answer);
            if (question.isCorrect(answer)) {
                correctCount++;
            }
        }

        Map<String, Integer> answerCounts = new HashMap<>();
        for (String answer : studentAnswers.values()) {
            answerCounts.put(answer, answerCounts.getOrDefault(answer, 0) + 1);
        }

        for (String answer : answerCounts.keySet()) {
            int count = answerCounts.get(answer);
            System.out.println("Number of students chose '" + answer + "': " + count);
        }

        System.out.println("Number of Correct Answers: " + correctCount);
    }
}