package com.eduecon.app.Constract;

import android.provider.BaseColumns;

public final class QuizConstract {

    private QuizConstract() {}

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTIONS = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_OPTION5 = "option5";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
        public static final String COLUMN_CATEGORY = "category";
    }
}
