package cntt61.mssv60137367.thigkbai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB, editSoH;
    TextView textViewKetQua;
    Button nutChuvi, nutDientich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWigget();
    }
    void TimWigget(){
        editSoA=(EditText)findViewById(R.id.edSoA);
        editSoB=(EditText)findViewById(R.id.edSoB);
        editSoH=(EditText)findViewById(R.id.edSoH);
        textViewKetQua=(TextView)findViewById(R.id.ketqua);
        nutChuvi = (Button) findViewById(R.id.btnChuvi);
        nutDientich = (Button) findViewById(R.id.btnDientich);
    }
    public void XulyChuVi(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu sô
        float a = Float.parseFloat(sA);
        float b = Float.parseFloat(sB);
        //tính toán
        float cv = (a+b)/2;
        //chuyễn tổng thành chuỗi
        String chuVi = String.valueOf(cv);
        //kết quả
        textViewKetQua.setText("Kết quả Chu Vi là:" + chuVi);
    }
    public void XulyDienTich(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sH = editSoH.getText().toString();
        //chuyển sang kiểu sô
        float a = Float.parseFloat(sA);
        float h = Float.parseFloat(sH);
        //tính toán
        float dt = (a+h)/2;
        //chuyễn tổng thành chuỗi
        String dienTich = String.valueOf(dt);
        //kết quả
        textViewKetQua.setText("Kết quả Chu Vi là:" + dienTich);
    }
}