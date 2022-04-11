package cntt61.mssv60137367.tnbtrungbkt2thu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btntinh;
    EditText edtNum;
    RadioButton rd13, rd15, rd18;
    TextView ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntinh = (Button)findViewById(R.id.button);
        edtNum = (EditText) findViewById(R.id.number);
        rd13 = (RadioButton) findViewById(R.id.radio13);
        rd15 = (RadioButton) findViewById(R.id.radio15);
        rd18 = (RadioButton) findViewById(R.id.radio18);
        ketqua = (TextView) findViewById(R.id.result);
    }
    public void TinhToan(View view){
        Float num = edtNum.getAlpha();
        if(rd13.isChecked()){
            num = num*13/100;
            rd15.setChecked(false);
            rd18.setChecked(false);
        }
        if(rd15.isChecked()){
            num = num*15/100;
            rd13.setChecked(false);
            rd18.setChecked(false);
        }
        if(rd18.isChecked()){
            num = num*18/100;
            rd13.setChecked(false);
            rd15.setChecked(false);
        }
        String s =String.valueOf(num);
        ketqua.setText(s);
    }
}