package com.londonappbrewery.quizzler;

/**
 * Created by Developer on 14/04/2018.
 */

public class TrueFalse {
    private int myQuestionID;
    private boolean mAnswer;

    public TrueFalse(int QuestionResourceID, boolean true0rFalse) {
        myQuestionID = QuestionResourceID;
        mAnswer = true0rFalse;
    }

    public int getMyQuestionID() {
        return myQuestionID;
    }

    public void setMyQuestionID(int myQuestionID) {
        this.myQuestionID = myQuestionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
