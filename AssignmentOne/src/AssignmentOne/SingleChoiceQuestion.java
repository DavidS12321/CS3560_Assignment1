package AssignmentOne;

import java.util.ArrayList;
import java.util.List;
public class SingleChoiceQuestion implements Question {
    private String questionText;
    private List<String> answerOptions;
    private String correctAnswer;
    public SingleChoiceQuestion(String questionText, List<String> answerOptions, String correctAnswer) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public List<String> getOptions() {
        return answerOptions;
    }

    @Override
    public String getQuestion() {
        return questionText;
    }

    @Override
    public boolean isCorrect(String answer){
        return answer.equals(correctAnswer);
    }
}
