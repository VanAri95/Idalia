package com.example.idalia;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class FileHelper {

    private static final String TAG = "FileHelperClass";

    private Context context;

    public FileHelper(Context context){
        this.context=context;
    }

    public String readFile (String file, String searchStr){
        String line="";
        AssetManager manager = context.getResources().getAssets();
        BufferedReader bufferedReader;
        InputStream inputStream;
        StringBuilder stringBuilder;
        try {
            inputStream = manager.open(file);
            stringBuilder = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            String str;

            while ((str = bufferedReader.readLine()) != null){
                //if file contains/or has etc. than do
                if (str.contains(searchStr)){
                    stringBuilder.append(str);
                }
            }

            bufferedReader.close();
            line=stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }

    public String readCSVFile(String file){
        String line="";
        AssetManager manager = context.getResources().getAssets();
        BufferedReader bufferedReader;
        InputStream inputStream;

        try {
            inputStream = manager.open(file);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            int lineCtr = 0;
            Random random = new Random();
            int numLines = 75968;
            int desiredLine = random.nextInt(numLines);

            while ((line = bufferedReader.readLine()) != null){
                Log.d(TAG, "While loop is entered");
                if (lineCtr == desiredLine){
                    Log.d(TAG, "If clause is done");
                    break;
                }
                lineCtr++;
            }

            bufferedReader.close();
            Log.d(TAG, "Chosen line is: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
