package vn.edu.ntu.mycalconstrainst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editSoA, editSoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWigget();
    }
    void TimWigget(){
        editSoA=(EditText)findViewById(R.id.edSoA);
        editSoB=(EditText)findViewById(R.id.edSoB);
        /*textViewKetQua=(TextView)findViewById(R.id.ketqua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);*/
    }
    //hàm xử lý
    public void XulyCong(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu sô
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //tính toán
        int tong = a+b;
        //chuyễn tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        //kết quả
        textViewKetQua.setText("Tổng là:" + chuoiTong);
    }
    public void XulyTru(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu sô
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //tính toán
        int tong = a-b;
        //chuyễn tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        //kết quả
        textViewKetQua.setText("Tổng là:" + chuoiTong);
    }
    public void XulyNhan(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu sô
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //tính toán
        int tong = a*b;
        //chuyễn tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        //kết quả
        textViewKetQua.setText("Tổng là:" + chuoiTong);
    }
    public void XulyChia(View v){
        //lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //chuyển sang kiểu sô
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //tính toán
        int tong = a/b;
        //chuyễn tổng thành chuỗi
        String chuoiTong = String.valueOf(tong);
        //kết quả
        textViewKetQua.setText("Tổng là:" + chuoiTong);
    }
}