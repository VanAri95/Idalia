package com.idalia.apk.ui.smalltalk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.idalia.apk.FileHelper;
import com.idalia.apk.R;

import java.util.Objects;

public class SmalltalkFragment extends Fragment {

    private SmalltalkViewModel smalltalkViewModel;

    private static final String TAG = "SmalltalkFragment";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final String instructions = new FileHelper(getActivity()).readFile("smalltalk.txt", "I. One");
        final String question1 = new FileHelper(getActivity()).readFile("smalltalk.txt", "1. When was");
        final String question2 = new FileHelper(getActivity()).readFile("smalltalk.txt", "2. What was");
        final String question4 = new FileHelper(getActivity()).readFile("smalltalk.txt", "4. How did");
        final String question3 = new FileHelper(getActivity()).readFile("smalltalk.txt", "3. If you");
        final String question5 = new FileHelper(getActivity()).readFile("smalltalk.txt", "5. Do you");
        final String question6 = new FileHelper(getActivity()).readFile("smalltalk.txt", "6. What is");
        final String question7 = new FileHelper(getActivity()).readFile("smalltalk.txt", "7. If you");
        final String question8 = new FileHelper(getActivity()).readFile("smalltalk.txt", "8. What is");
        final String question9 = new FileHelper(getActivity()).readFile("smalltalk.txt", "9. Describe");
        final String question10 = new FileHelper(getActivity()).readFile("smalltalk.txt", "10. What is");
        final String question11 = new FileHelper(getActivity()).readFile("smalltalk.txt", "11. Tell your");
        final String question12 = new FileHelper(getActivity()).readFile("smalltalk.txt", "12. What gifts");
        final String question13 = new FileHelper(getActivity()).readFile("smalltalk.txt", "13. Describe");
        final String question14 = new FileHelper(getActivity()).readFile("smalltalk.txt", "14. Tell the");
        final String question15 = new FileHelper(getActivity()).readFile("smalltalk.txt", "15. One of");
        final String question16 = new FileHelper(getActivity()).readFile("smalltalk.txt", "16. Do you");
        final String question17 = new FileHelper(getActivity()).readFile("smalltalk.txt", "17. Where are");
        final String question18 = new FileHelper(getActivity()).readFile("smalltalk.txt", "18. What did");
        final String question19 = new FileHelper(getActivity()).readFile("smalltalk.txt", "19. What gifts");
        final String question20 = new FileHelper(getActivity()).readFile("smalltalk.txt", "20. Who is");
        final String question21 = new FileHelper(getActivity()).readFile("smalltalk.txt", "21. What is");
        final String question22 = new FileHelper(getActivity()).readFile("smalltalk.txt", "22. What is");
        final String question23 = new FileHelper(getActivity()).readFile("smalltalk.txt", "23. Where did");
        final String question24 = new FileHelper(getActivity()).readFile("smalltalk.txt", "24. What is");
        final String question25 = new FileHelper(getActivity()).readFile("smalltalk.txt", "25. What foreign");
        final String question26 = new FileHelper(getActivity()).readFile("smalltalk.txt", "26. Do you");
        final String question27 = new FileHelper(getActivity()).readFile("smalltalk.txt", "27. Describe");
        final String question28 = new FileHelper(getActivity()).readFile("smalltalk.txt", "28. What are");
        final String question29 = new FileHelper(getActivity()).readFile("smalltalk.txt", "29. How often");
        final String question30 = new FileHelper(getActivity()).readFile("smalltalk.txt", "30. Did you");
        final String question31 = new FileHelper(getActivity()).readFile("smalltalk.txt", "31. Do you");
        final String question32 = new FileHelper(getActivity()).readFile("smalltalk.txt", "32. What is");
        final String question33 = new FileHelper(getActivity()).readFile("smalltalk.txt", "33. Do you");
        final String question34 = new FileHelper(getActivity()).readFile("smalltalk.txt", "34. Were you");
        final String lastquestion = new FileHelper(getActivity()).readFile("smalltalk.txt", "Congratulations,");

        smalltalkViewModel =
                ViewModelProviders.of(this).get(SmalltalkViewModel.class);
        View root = inflater.inflate(R.layout.fragment_smalltalk, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        final Button continueButton = root.findViewById(R.id.continue_button_smalltalk);
        final Button backButton = root.findViewById(R.id.back_button_smalltalk);
        //backButton.setVisibility(View.INVISIBLE);
/*
        if (backButton.getVisibility() == View.INVISIBLE){
            Log.i(TAG, "If clause is entered");
            ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
            );

            params.endToEnd = R.id.layout_smalltalk;
            params.topToBottom = R.id.text_slideshow;
            params.setMarginEnd(400);
            continueButton.setLayoutParams(params);
        }
*/
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Going forward
                if (Objects.requireNonNull(smalltalkViewModel.getCurrentQuestion().getValue()).matches("Welcome to smalltalk improvement part! When you are ready, press continue.")){
                    smalltalkViewModel.getCurrentQuestion().setValue(instructions.substring(3));
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(instructions.substring(3))) {
                    smalltalkViewModel.getCurrentQuestion().setValue(question1);
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
                    backButton.setLayoutParams(params3);*/

                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question1)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question2);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question2)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question3);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question3)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question4);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question4)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question5);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question5)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question6);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question6)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question7);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question7)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question8);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question8)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question9);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question9)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question10);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question10)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question11);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question11)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question12);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question12)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question13);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question13)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question14);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question14)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question15);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question15)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question16);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question16)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question17);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question17)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question18);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question18)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question19);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question19)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question20);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question20)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question21);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question21)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question22);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question22)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question23);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question23)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question24);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question24)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question25);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question25)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question26);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question26)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question27);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question27)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question28);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question28)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question29);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question29)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question30);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question30)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question31);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question31)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question32);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question32)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question33);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question33)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question34);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question34)){
                    smalltalkViewModel.getCurrentQuestion().setValue(lastquestion);
                }
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Going backwards
                if (Objects.requireNonNull(smalltalkViewModel.getCurrentQuestion().getValue()).equals(question34)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question33);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question33)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question32);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question32)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question31);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question31)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question30);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question30)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question29);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question29)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question28);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question28)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question27);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question27)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question26);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question26)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question25);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question25)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question24);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question24)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question23);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question23)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question22);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question22)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question21);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question21)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question20);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question20)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question19);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question19)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question18);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question18)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question17);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question17)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question16);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question16)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question15);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question15)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question14);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question14)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question13);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question13)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question12);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question12)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question11);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question11)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question10);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question10)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question9);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question9)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question8);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question8)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question7);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question7)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question6);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question6)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question5);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question5)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question4);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question4)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question3);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question3)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question2);
                } else if (smalltalkViewModel.getCurrentQuestion().getValue().equals(question2)){
                    smalltalkViewModel.getCurrentQuestion().setValue(question1);
                }
            }
        });

        smalltalkViewModel.getCurrentQuestion().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
   }
}