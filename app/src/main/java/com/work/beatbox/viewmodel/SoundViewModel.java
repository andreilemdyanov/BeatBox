package com.work.beatbox.viewmodel;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.work.beatbox.model.BeatBox;
import com.work.beatbox.model.Sound;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }
    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }
}
