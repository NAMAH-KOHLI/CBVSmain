package com.example.cbvs;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Candidate_Ele extends SQLiteOpenHelper {
    public static final String DATABASE_NAME2 = "Candidate2";
    public static final String TABLE_NAME2 = "Candidate_Table";
    public static final String COLM_1 = "C_PARTY";
    public static final String COLM_2 = "C_NAME";
    public static final String COLM_3 = "WARD2";

    public Candidate_Ele(@Nullable Context context) {
        super(context, DATABASE_NAME2, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        String sql1 = (" create table " + TABLE_NAME2 + "(C_PARTY TEXT, C_NAME TEXT, WARD2 INTEGER, CONSTITUENCY_2 TEXT, VOTES INTEGER)");
        db2.execSQL(sql1);
        insertData2("TAP", "TAGRIWAL", 11, "KALYAN", 0, db2);
        insertData2("CONT", "RIWAL", 11, "KALYAN", 0, db2);
        insertData2("CJP", "TAWAL", 11,"KALYAN", 0, db2);
        insertData2("CONT", "CAHUL", 13, "THANE", 0, db2);
        insertData2("TAP", "TAHUL", 13, "THANE", 0, db2);
        insertData2("CJP", "LAHUL", 13,"THANE", 0, db2);
        insertData2("CJP", "NODI", 12,"DOMBIVILI", 0, db2);
        insertData2("TAP", "TODI", 12,"DOMBIVILI", 0, db2);
        insertData2("CONT", "JODI", 12, "DOMBIVILI", 0, db2);

    }
    private void insertData2(String PARTY_C, String NAME_C, Integer WARD_2,String constituency_2,Integer votes, SQLiteDatabase db2)
    {
        db2 = this.getWritableDatabase();
        ContentValues values2;
        values2 = new ContentValues();
        values2.put("C_PARTY",PARTY_C);
        values2.put("C_NAME",NAME_C);
        values2.put("WARD2",WARD_2);
        values2.put("CONSTITUENCY_2",constituency_2);
        values2.put("VOTES",votes);
        db2.insert("TABLE_NAME2", null, values2);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db2, int i1, int i2) {
        db2.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db2);

    }
}
