package AssignmentOne;

import java.util.List;

class MultipleChoiceQuestion implements Question {
    private String questionText;
    private List<String> answerOptions;
    private List<String> correctAnswers;

    public MultipleChoiceQuestion(String questionText, List<String> answerOptions, List<String> correctAnswers) {
        this.questionText = questionText;
        this.answerOptions = answerOptions;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String getQuestion() {
        return questionText;
    }

    @Override
    public List<String> getOptions() {
        return answerOptions;
    }

    @Override
    public boolean isCorrect(String answer) {
        return correctAnswers.contains(answer);
    }
}
