package com.example.kontakku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit_nama = findViewById(R.id.edit_nama);
        final EditText edit_nohp = findViewById(R.id.edit_nohp);

        Button btn = findViewById(R.id.btn_submit);
        DAOEmployee dao = new DAOEmployee();
        btn.setOnClickListener(v ->
                {
                    /*Employee emp = new Employee(edit_nama.getText().toString(), edit_nohp.getText().toString());
                    dao.add(emp).addOnSuccessListener(suc ->
                    {
                        Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
                    }).addOnFailureListener(er ->
                    {
                        Toast.makeText(this, "Record is not inserted", Toast.LENGTH_SHORT).show();
                    });
                    /*HashMap<String,Object> hashMap = new HashMap<>();
                    hashMap.put("nama",edit_nama.getText().toString());
                    hashMap.put("nohp",edit_nohp.getText().toString());

                    Employee emp = new Employee(edit_nama.getText().toString(), edit_nohp.getText().toString());
                    dao.update("-MdRFF8RDB16z0C42nc-",hashMap).addOnSuccessListener(suc ->
                    {
                        Toast.makeText(this, "Record is update", Toast.LENGTH_SHORT).show();
                    }).addOnFailureListener(er ->
                    {
                        Toast.makeText(this, "Record is not update", Toast.LENGTH_SHORT).show();
                    });*/
                    dao.remove("-MdRI8wV21MiBrouvUK-").addOnSuccessListener(suc ->
                    {
                        Toast.makeText(this, "Record is removed", Toast.LENGTH_SHORT).show();
                    }).addOnFailureListener(er ->
                    {
                        Toast.makeText(this, "Record is not remove", Toast.LENGTH_SHORT).show();
                    });
                });
    }
}