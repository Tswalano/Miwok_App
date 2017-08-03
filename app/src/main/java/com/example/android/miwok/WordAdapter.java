package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word>{

    private int mColorResourseId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourseId){
        super(context, 0, words);
        mColorResourseId = colorResourseId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miworkTextView = (TextView)listItemView.findViewById(R.id.miwork_text_view);
        miworkTextView.setText(currentWord.getMiworkTranslation());

        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourseId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
