package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miworkTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miworkTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiworkTranslation(){
        return mMiworkTranslation;
    }

    public int getImageResourceId(){return mImageResourceId;}

    //Returns whete=heres theeres an image or not
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){return mAudioResourceId;}
}
