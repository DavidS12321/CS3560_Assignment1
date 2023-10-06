package AssignmentOne;

import java.util.List;
public interface Question {
    List<String> getOptions();
    String getQuestion();
    boolean isCorrect(String answer);
}