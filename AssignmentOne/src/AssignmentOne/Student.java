package AssignmentOne;

class Student {
    private String studentID;
    private String response;

    public Student(String studentID, String response) {
        this.studentID = studentID;
        this.response = response;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getResponse() {
        return response;
    }
}