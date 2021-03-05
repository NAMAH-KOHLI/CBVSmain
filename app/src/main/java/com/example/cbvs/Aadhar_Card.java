package com.example.cbvs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Aadhar_Card extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Aadhar";
    public static final String TABLE_NAME = "Aadhar_Table";
    public static final String COL_1 = "Aadhar_ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "AGE";
    public static final String COL_4 = "STATE";
    public static final String COL_5 = "DISTRICT";
    public static final String COL_6 = "WARD";
    public static final String COL_7 = "ADDRESS";
    // 2nd table
    public static final String TABLE_NAME2 = "Candidate_Table";
    public static final String COLM_1 = "C_PARTY";
    public static final String COLM_2 = "C_NAME";
    public static final String COLM_3 = "WARD_2";
    public static final String COLM_4 = "CONSTITUENCY_2";
    public static final String COLM_5 = "VOTES";
    //int count1;

    public Aadhar_Card(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String table = (" CREATE TABLE  TABLE_NAME (Aadhar_ID INTEGER PRIMARY KEY, NAME TEXT, AGE INTEGER, STATE TEXT, DISTRICT TEXT, WARD TEXT, CONSTITUENCY TEXT, ADDRESS TEXT, FLAG INTEGER)");
        db.execSQL(table);
        String table2 = (" CREATE TABLE TABLE_NAME2 (C_PARTY TEXT, C_NAME TEXT, WARD_2 INTEGER, CONSTITUENCY_2 TEXT, VOTES INTEGER, FOREIGN KEY (WARD_2) REFERENCES TABLE_NAME (WARD), FOREIGN KEY (CONSTITUENCY_2) REFERENCES TABLE_NAME (CONSTITUENCY))");
        db.execSQL(table2);
        insertData(Integer.valueOf("12322"), "tik", 42, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12321"), "Ram", 50, "Maharashtra", "Kanpur", 12, "THANE", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12320"), "Sham", 30, "Maharashtra", "Kanpur", 11, "KALYAN", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12319"), "Tam", 25, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12318"), "Lam", 24, "Maharashtra", "Kanpur", 11, "KALYAN", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12317"), "Khan", 19, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12316"), "Tum", 14, "Maharashtra", "Kanpur", 12, "KALYAN", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12315"), "Namah", 19, "Maharashtra", "Kalyan", 11, "THANE", "Apollonia, triveni laurel", 0, db);
        insertData(Integer.valueOf("12314"), "Ayush", 22, "Maharashtra", "Thane", 13, "THANE", "Amber, triveni laurel", 0, db);
        insertData(Integer.valueOf("12313"), "Sanskruti", 15, "Maharashtra", "Dombivily", 12, "DOMBIVILI", "KBJJJJ ", 0, db);
        insertData(Integer.valueOf("12312"), "Sanket", 20, "Maharashtra", "Ambernath", 11, "THANE", "JHVVYBU", 0, db);
        insertData(Integer.valueOf("12311"), "Luv", 21, "Maharashtra", "Ulhasnagar", 13, "THANE", "JHVJHBJKJ", 0, db);
        insertData(Integer.valueOf("12310"), "Rhitik", 18, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12309"), "Tik", 19, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12308"), "Lik", 40, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12307"), "Kam", 45, "Maharashtra", "Kanpur", 11, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12306"), "lam", 50, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12305"), "hitik", 55, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12304"), "Kol", 60, "Maharashtra", "Kanpur", 11, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12303"), "Lol", 15, "Maharashtra", "Kanpur", 11, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12302"), "Lool", 25, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12301"), "LINK", 20, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12300"), "Peter", 27, "Maharashtra", "Kanpur", 12, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12323"), "Pan", 37, "Maharashtra", "Kanpur", 13, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData(Integer.valueOf("12324"), "Paann", 30, "Maharashtra", "Kanpur", 11, "DOMBIVILI", "VJHGKKHKJHKH", 0, db);
        insertData2("TAP", "TAGRIWAL", 11, "KALYAN", Integer.valueOf("0"), db);
        insertData2("CONT", "RIWAL", 11, "KALYAN", Integer.valueOf("0"), db);
        insertData2("CJP", "TAWAL", 11,"KALYAN", Integer.valueOf("0"), db);
        insertData2("TAP", "CAHUL", 13, "THANE", Integer.valueOf("0"), db);
        insertData2("CONT", "TAHUL", 13, "THANE", Integer.valueOf("0"), db);
        insertData2("CJP", "LAHUL", 13,"THANE", Integer.valueOf("0"), db);
        insertData2("TAP", "NODI", 12,"DOMBIVILI", Integer.valueOf("0"), db);
        insertData2("CONT", "TODI", 12,"DOMBIVILI", Integer.valueOf("0"), db);
        insertData2("CJP", "JODI", 12, "DOMBIVILI", Integer.valueOf("0"), db);
    }

    public void insertData(Integer aadhar_id, String name, Integer age, String state, String district, Integer ward, String constituency, String address, Integer flag, SQLiteDatabase myDb) {
      // myDb = this.getReadableDatabase();
        ContentValues values;
        values = new ContentValues();
        values.put("Aadhar_ID", aadhar_id);
        values.put("NAME", name);
        values.put("AGE", age);
        values.put("STATE", state);
        values.put("DISTRICT", district);
        values.put("WARD", ward);
        values.put("CONSTITUENCY", constituency);
        values.put("Address", address);
        values.put("FLAG", flag);
        myDb.insert("TABLE_NAME", null, values);

    }
    private void insertData2(String PARTY_C, String NAME_C, Integer WARD_2,String constituency_2,Integer votes, SQLiteDatabase myDb)
    {
        //table 2
        ContentValues values2;
        values2 = new ContentValues();
        values2.put("C_PARTY",PARTY_C);
        values2.put("C_NAME",NAME_C);
        values2.put("WARD_2",WARD_2);
        values2.put("CONSTITUENCY_2",constituency_2);
        values2.put("VOTES",votes);
        myDb.insert("TABLE_NAME2", null, values2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);
    }

    public Boolean checkMail(String aadhar_id) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select Aadhar_ID, AGE  from TABLE_NAME where Aadhar_ID=? AND AGE > 17 AND FLAG < 1", new String[]{aadhar_id});
        if (cursor.getCount()>0) return true;
        else return false;
    }
    public Boolean checkMail2(String aadhar_id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("flag","1");
        db.update("TABLE_NAME", cv, "Aadhar_ID=?",new String[]{aadhar_id});
     return true;
    }



    public Boolean p1(String aadhar_id){
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery("Select WARD from TABLE_NAME UNION Select WARD_2 from TABLE_NAME2 Order by WARD", new String[]{});
    if (cursor.getCount()>0)
    return true;
    return false;
    }

//---------------------------------------------------------------------------------
    public Boolean a1(String q,String xx) {
        SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cx = new ContentValues();
            Integer aa=0;
        Cursor cursor = db.rawQuery("Select VOTES from TABLE_NAME2 where WARD_2=? AND C_PARTY=?",new String[]{q, xx});
        if(cursor!=null) {
            cursor.moveToFirst();
        }
        aa=cursor.getInt(0);
        do{
            aa++;
            cx.put("votes", aa);
            db.update("TABLE_NAME2", cx, "WARD_2=? AND C_PARTY=?", new String[]{q, xx});
        }while(cursor.moveToNext());
        return true;
    }

//-----------------------------------------------------------------------------------
public String ww(String aadhar_id){
        String w1;
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery("Select WARD from TABLE_NAME where Aadhar_ID=?",new String[]{aadhar_id});
    if(cursor!=null) {
    cursor.moveToFirst();
    }
    do{
        w1=cursor.getString(0);
    }while(cursor.moveToNext());
        return w1;
}
public String allData(){
        String w1;
    SQLiteDatabase db = this.getWritableDatabase();
    Cursor cursor = db.rawQuery("Select * from TABLE_NAME2",null);
    if(cursor!=null) {
        cursor.moveToFirst();
    }
    do{
        w1=cursor.getString(0);
    }while(cursor.moveToNext());
    return w1;
}
}
