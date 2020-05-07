package com.example.idalia.ui.questionnaire;

import android.os.Bundle;
import android.os.FileUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.idalia.FileHelper;
import com.example.idalia.R;

import java.util.Objects;

public class QuestionnaireFragment extends Fragment {

    private QuestionnaireViewModel questionnaireViewModel;

    private static final String TAG = "QuestionnaireFragment";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final String instructions = new FileHelper(getActivity()).readFile("questionnaire.txt", "I. One");
        final String question1 = new FileHelper(getActivity()).readFile("questionnaire.txt", "1. Given");
        final String question2 = new FileHelper(getActivity()).readFile("questionnaire.txt", "2. Would you");
        final String question4 = new FileHelper(getActivity()).readFile("questionnaire.txt", "4. What would");
        final String question3 = new FileHelper(getActivity()).readFile("questionnaire.txt", "3. Before");
        final String question5 = new FileHelper(getActivity()).readFile("questionnaire.txt", "5. When");
        final String question6 = new FileHelper(getActivity()).readFile("questionnaire.txt", "6. If");
        final String question7 = new FileHelper(getActivity()).readFile("questionnaire.txt", "7. Do you");
        final String question8 = new FileHelper(getActivity()).readFile("questionnaire.txt", "8. Name three");
        final String question9 = new FileHelper(getActivity()).readFile("questionnaire.txt", "9. For");
        final String question10 = new FileHelper(getActivity()).readFile("questionnaire.txt", "10. If you");
        final String question11 = new FileHelper(getActivity()).readFile("questionnaire.txt", "11. Take 4");
        final String question12 = new FileHelper(getActivity()).readFile("questionnaire.txt", "12. If you");
        final String question13 = new FileHelper(getActivity()).readFile("questionnaire.txt", "13. If a");
        final String question14 = new FileHelper(getActivity()).readFile("questionnaire.txt", "14. Is there");
        final String question15 = new FileHelper(getActivity()).readFile("questionnaire.txt", "15. What is");
        final String question16 = new FileHelper(getActivity()).readFile("questionnaire.txt", "16. What do");
        final String question17 = new FileHelper(getActivity()).readFile("questionnaire.txt", "17. What is");
        final String question18 = new FileHelper(getActivity()).readFile("questionnaire.txt", "18. What is");
        final String question19 = new FileHelper(getActivity()).readFile("questionnaire.txt", "19. If you");
        final String question20 = new FileHelper(getActivity()).readFile("questionnaire.txt", "20. What does");
        final String question21 = new FileHelper(getActivity()).readFile("questionnaire.txt", "21. What roles");
        final String question22 = new FileHelper(getActivity()).readFile("questionnaire.txt", "22. Alternate");
        final String question23 = new FileHelper(getActivity()).readFile("questionnaire.txt", "23. How close");
        final String question24 = new FileHelper(getActivity()).readFile("questionnaire.txt", "24. How do");
        final String question25 = new FileHelper(getActivity()).readFile("questionnaire.txt", "25. Make 3");
        final String question26 = new FileHelper(getActivity()).readFile("questionnaire.txt", "26. Complete");
        final String question27 = new FileHelper(getActivity()).readFile("questionnaire.txt", "27. If you");
        final String question28 = new FileHelper(getActivity()).readFile("questionnaire.txt", "28. Tell your");
        final String question29 = new FileHelper(getActivity()).readFile("questionnaire.txt", "29. Share with");
        final String question30 = new FileHelper(getActivity()).readFile("questionnaire.txt", "30. When did");
        final String question31 = new FileHelper(getActivity()).readFile("questionnaire.txt", "31. Tell your");
        final String question32 = new FileHelper(getActivity()).readFile("questionnaire.txt", "32. What,");
        final String question33 = new FileHelper(getActivity()).readFile("questionnaire.txt", "33. If you");
        final String question34 = new FileHelper(getActivity()).readFile("questionnaire.txt", "34. Your house");
        final String question35 = new FileHelper(getActivity()).readFile("questionnaire.txt", "35. Of all");
        final String question36 = new FileHelper(getActivity()).readFile("questionnaire.txt", "36. Share");
        final String question37 = new FileHelper(getActivity()).readFile("questionnaire.txt", "37. For the");
        final String lastquestion = new FileHelper(getActivity()).readFile("questionnaire.txt", "Congratulations,");

        questionnaireViewModel =
                ViewModelProviders.of(this).get(QuestionnaireViewModel.class);
        View root = inflater.inflate(R.layout.fragment_questionnaire, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final Button continueButton = root.findViewById(R.id.continue_button_questionnaire);
        final Button backButton = root.findViewById(R.id.back_button_questionnaire);
        /*backButton.setVisibility(View.INVISIBLE);

        if (backButton.getVisibility() == View.INVISIBLE){
            Log.i(TAG, "If clause is entered");
            ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
            );

            params.endToEnd = R.id.layout_questionnaire;
            params.topToBottom = R.id.card_view1;
            params.setMarginEnd(400);
            continueButton.setLayoutParams(params);
        }*/

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Going forward
                if (Objects.requireNonNull(questionnaireViewModel.getCurrentQuestion().getValue()).matches("Welcome to the questionnaire! When you are ready, press continue.")){
                    questionnaireViewModel.getCurrentQuestion().setValue(instructions.substring(3));
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(instructions.substring(3))) {
                    questionnaireViewModel.getCurrentQuestion().setValue(question1);
                    /*backButton.setVisibility(View.VISIBLE);
                    Log.i(TAG, "Continuebutton is set true");
                    ConstraintLayout.LayoutParams params2 = new ConstraintLayout.LayoutParams(
                            ConstraintLayout.LayoutParams.WRAP_CONTENT,
                            ConstraintLayout.LayoutParams.WRAP_CONTENT
                    );

                    params2.endToEnd = R.id.layout_smalltalk;
                    params2.topToBottom = R.id.text_slideshow;
                    params2.setMarginEnd(80);
                    continueButton.setLayoutParams(params2);

                    Log.i(TAG, "BackButton is set true");
                    ConstraintLayout.LayoutParams params3 = new ConstraintLayout.LayoutParams(
                            ConstraintLayout.LayoutParams.WRAP_CONTENT,
                            ConstraintLayout.LayoutParams.WRAP_CONTENT
                    );

                    params3.startToStart = R.id.layout_smalltalk;
                    params3.topToBottom = R.id.text_slideshow;
                    params3.setMarginStart(80);
                    backButton.setLayoutParams(params3); */

                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question1)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question2);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question2)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question3);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question3)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question4);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question4)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question5);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question5)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question6);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question6)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question7);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question7)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question8);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question8)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question9);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question9)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question10);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question10)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question11);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question11)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question12);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question12)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question13);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question13)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question14);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question14)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question15);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question15)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question16);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question16)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question17);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question17)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question18);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question18)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question19);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question19)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question20);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question20)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question21);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question21)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question22);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question22)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question23);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question23)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question24);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question24)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question25);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question25)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question26);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question26)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question27);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question27)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question28);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question28)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question29);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question29)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question30);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question30)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question31);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question31)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question32);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question32)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question33);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question33)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question34);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question34)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question35);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question35)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question36);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question36)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question37);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question37)){
                    questionnaireViewModel.getCurrentQuestion().setValue(lastquestion);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Going backwards
                if (Objects.requireNonNull(questionnaireViewModel.getCurrentQuestion().getValue()).equals(question37)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question36);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question36)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question35);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question35)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question34);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question34)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question33);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question33)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question32);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question32)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question31);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question31)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question30);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question30)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question29);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question29)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question28);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question28)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question27);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question27)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question26);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question26)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question25);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question25)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question24);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question24)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question23);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question23)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question22);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question22)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question21);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question21)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question20);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question20)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question19);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question19)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question18);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question18)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question17);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question17)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question16);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question16)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question15);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question15)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question14);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question14)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question13);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question13)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question12);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question12)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question11);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question11)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question10);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question10)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question9);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question9)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question8);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question8)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question7);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question7)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question6);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question6)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question5);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question5)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question4);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question4)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question3);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question3)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question2);
                } else if (questionnaireViewModel.getCurrentQuestion().getValue().equals(question2)){
                    questionnaireViewModel.getCurrentQuestion().setValue(question1);
                }
            }
        });

        questionnaireViewModel.getCurrentQuestion().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}