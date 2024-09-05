package com.example.exercicio1_applikes;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikesViewModel extends ViewModel {
    private MutableLiveData<String> nome = new MutableLiveData<>("Kamilly");
    private MutableLiveData<String> sobrenome = new MutableLiveData<>("Cristine");
    private MutableLiveData<Integer> imgLike = new MutableLiveData<>(R.drawable.baseline_thumb_up_alt_24);
    private MutableLiveData<Integer> likes = new MutableLiveData<>(0);

    public void curtir() {
        Integer qtdLikes = likes.getValue();
        if (qtdLikes != null) {
            likes.setValue(qtdLikes + 1);

            if (qtdLikes + 1 <= 3) {
                imgLike.setValue(R.drawable.baseline_thumb_up_alt_24);
            } else if (qtdLikes + 1 > 3 && qtdLikes + 1 <= 9) {
                imgLike.setValue(R.drawable.baseline_sentiment_very_satisfied_24);
            } else if (qtdLikes + 1 > 9) {
                imgLike.setValue(R.drawable.baseline_local_fire_department_24);
            }
        }
    }

    public MutableLiveData<String> getNome() {
        return nome;
    }

    public MutableLiveData<String> getSobrenome() {
        return sobrenome;
    }

    public MutableLiveData<Integer> getImgLike() {
        return imgLike;
    }

    public MutableLiveData<Integer> getLikes() {
        return likes;
    }
}
