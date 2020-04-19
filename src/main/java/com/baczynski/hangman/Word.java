package com.baczynski.hangman;

public class Word {
    private int Id;
    private String Word;
    private String Lang;
    private int Level;

    public Word() {}

    public Word(int Id, String Word, String Lang, int Level) {
        this.Id = Id;
        this.Word = Word;
        this.Lang = Lang;
        this.Level = Level;
    }

    public int getId() {
        return Id;
    }

    public String getWord() {
        return Word;
    }

    public String getLang() {
        return Lang;
    }

    public int getLevel() {
        return Level;
    }

}
