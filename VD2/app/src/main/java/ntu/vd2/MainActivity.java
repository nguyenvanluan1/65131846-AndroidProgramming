package ntu.vd2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo01);
        editTextSo2 = (EditText) findViewById(R.id.edtSo02);
        editTextKQ = (EditText)findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia= (Button) findViewById(R.id.btnChia);
    }
     public void XuLyCong(View v){
        //code xu ly cong o day
         //b1. lay du lieu 2 so
         //b1.1. tim Edittext so 1 va so 2
         //b1.2. lay du lieu tu 2 dieu khien do
         String soThu1 = editTextSo1.getText().toString();
         String soThu2 = editTextSo2.getText().toString();
         //b1.3. Chuyen du lieu tu chuoi sang so
         float  soA = Float.parseFloat(soThu1);
         float  soB = Float.parseFloat(soThu2);
         //b2. tinh toan
         float Tong = soA + soB;
         //b3.Hien ket qua
         //b3.1.
         //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
         String chuoiKQ = String.valueOf(Tong);
         //b3.3. gan ket qua len dk
         editTextKQ.setText(chuoiKQ);
     }
    public void XuLyTru(View v){
        //code xu ly tru o day
        //code xu ly cong o day
        //b1. lay du lieu 2 so
        //b1.1. tim Edittext so 1 va so 2

        //b1.2. lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float  soA = Float.parseFloat(soThu1);
        float  soB = Float.parseFloat(soThu2);
        //b2. tinh toan
        float Hieu = soA - soB;
        //b3.Hien ket qua
        //b3.1.

        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Hieu);
        //b3.3. gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyNhan(View v){
        //code xu ly nhan o day
        //b1. lay du lieu 2 so
        //b1.1. tim Edittext so 1 va so 2

        //b1.2. lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float  soA = Float.parseFloat(soThu1);
        float  soB = Float.parseFloat(soThu2);
        //b2. tinh toan
        float Tich = soA * soB;
        //b3.Hien ket qua
        //b3.1.

        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Tich);
        //b3.3. gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
    public void XuLyChia(View v){
        //code xu ly Chia o day
        //b1. lay du lieu 2 so
        //b1.1. tim Edittext so 1 va so 2


        //b1.2. lay du lieu tu 2 dieu khien do
        String soThu1 = editTextSo1.getText().toString();
        String soThu2 = editTextSo2.getText().toString();
        //b1.3. Chuyen du lieu tu chuoi sang so
        float  soA = Float.parseFloat(soThu1);
        float  soB = Float.parseFloat(soThu2);
        //b2. tinh toan
        float Thuong = soA / soB;
        //b3.Hien ket qua
        //b3.1.

        //b3.2 chuan bi du lieu xuat, bien thanh dang chuoi
        String chuoiKQ = String.valueOf(Thuong);
        //b3.3. gan ket qua len dk
        editTextKQ.setText(chuoiKQ);
    }
}