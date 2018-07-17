package com.example.hp7.medicinereminder3;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

class Medicine {
    private Cursor data;
    private SQLiteDatabase writableDatabase;

    public Medicine(MainActivity mainActivity) {

    }

    public void addData(String trim, String trim1, String trim2) {
    }

    public Cursor getData() {
        return data;
    }

    public SQLiteDatabase getWritableDatabase() {
        return writableDatabase;
    }

    public void onDelete(String s) {
    }
}
