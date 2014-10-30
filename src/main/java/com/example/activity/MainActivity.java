package com.example.activity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.DatePicker;
import com.example.R;

public class MainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    setTitle("Deckard");
    new DialogFragment() {
      @Override
      public Dialog onCreateDialog(Bundle savedInstanceState) {
        new DatePickerDialog(MainActivity.this, android.R.style.Theme_Holo_Dialog, new DatePickerDialog.OnDateSetListener() {
          @Override
          public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

          }
        }, 2014, 9, 26);
        return super.onCreateDialog(savedInstanceState);
      }
    }.show(getFragmentManager(), "face");
  }
}
