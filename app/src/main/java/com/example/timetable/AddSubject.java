package com.example.timetable;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddSubject extends ActionBarActivity {

    DatabaseHelper myDb;
    EditText editSubjectName, editAbbreviation;
    Button button_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_entry);

        myDb = new DatabaseHelper(this);
        editSubjectName = (EditText)findViewById(R.id.editText_subjectName);
        editAbbreviation = (EditText)findViewById(R.id.editText_abbreviation);
        button_add = (Button)findViewById(R.id.button_add);
        AddData();
    }

    public void AddData()
    {
        button_add.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        boolean isInserted =  myDb.insertData(editSubjectName.getText().toString(), editAbbreviation.getText().toString());
                        if(isInserted)
                        {
                            Toast.makeText(getBaseContext(), "Data Added", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
