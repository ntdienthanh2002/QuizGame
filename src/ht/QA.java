/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht;

/**
 *
 * @author PC
 */
public class QA {

    private int QuesID;
    private String Question, Answer1, Answer2, Answer3, Answer4, RightAnswer;
    private int Level;

    public QA(int QuesID, String Question, String Answer1, String Answer2, String Answer3, String Answer4, String RightAnswer, int Level) {
        this.QuesID = QuesID;
        this.Question = Question;
        this.Answer1 = Answer1;
        this.Answer2 = Answer2;
        this.Answer3 = Answer3;
        this.Answer4 = Answer4;
        this.RightAnswer = RightAnswer;
        this.Level = Level;
    }

    public int getQuesID() {
        return QuesID;
    }

    public void setQuesID(int QuesID) {
        this.QuesID = QuesID;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public String getAnswer1() {
        return Answer1;
    }

    public void setAnswer1(String Answer1) {
        this.Answer1 = Answer1;
    }

    public String getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(String Answer2) {
        this.Answer2 = Answer2;
    }

    public String getAnswer3() {
        return Answer3;
    }

    public void setAnswer3(String Answer3) {
        this.Answer3 = Answer3;
    }

    public String getAnswer4() {
        return Answer4;
    }

    public void setAnswer4(String Answer4) {
        this.Answer4 = Answer4;
    }

    public String getRightAnswer() {
        return RightAnswer;
    }

    public void setRightAnswer(String RightAnswer) {
        this.RightAnswer = RightAnswer;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

}
