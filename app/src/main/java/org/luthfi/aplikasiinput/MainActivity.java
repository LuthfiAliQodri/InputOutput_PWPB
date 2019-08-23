package org.luthfi.aplikasiinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText fNama;
    private EditText fBirthday;
    private EditText fKtp;
    private EditText fAlamat;
    private Button Submit;
    private TextView Idoutnama;
    private TextView Idoutbirth;
    private TextView Idoutktp;
    private TextView Idoutalamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fNama = findViewById(R.id.idnama);
        fBirthday = findViewById(R.id.idtanggal);
        fKtp = findViewById(R.id.idktp);
        fAlamat = findViewById(R.id.idalamat);
        Submit = findViewById(R.id.submit);
        Idoutnama = findViewById(R.id.idoutnama);
        Idoutbirth = findViewById(R.id.idoutbirth);
        Idoutktp = findViewById(R.id.idoutktp);
        Idoutalamat = findViewById(R.id.idoutalamat);

        Submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit);
        String inputNama = fNama.getText().toString();
        String inputBirth = fBirthday.getText().toString();
        String inputKtp = fKtp.getText().toString();
        String inputAlamat = fAlamat.getText().toString();

        if (inputNama.length()==0){
            fNama.setError("Jangan Lupa Diisi!");
        }else{
            Idoutnama.setText(inputNama);
        }if (inputBirth.length()==0){
            fBirthday.setError("Jangan Lupa Diisi!");
        }else{
            Idoutbirth.setText(inputBirth);
        }if (inputKtp.length()==0) {
            fKtp.setError("Jangan Lupa Diisi!");
        }else{
            Idoutktp.setText(inputKtp);
        }if (inputAlamat.length()==0) {
            fAlamat.setError("Jangan Lupa Diisi!");
        }else{
            Idoutalamat.setText(inputAlamat);
        }
    }
}
