package tiil.edu.th7listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Hien thi du lieu len ListView
        //B1+: Can co du lieu
        //?? tu dau co: tu co so du lieu ( SQL, noSQL, XML,..)
        //Hard-code du lieu truc tiep
        //da chuyen ra ngoai khai bao
        dsTenTinhThanhVN = new ArrayList<String>();
        //them du lieu
        dsTenTinhThanhVN.add("Ha Noi");
        dsTenTinhThanhVN.add("TP Ho Chi Minh");
        dsTenTinhThanhVN.add("Dong Nai");
        dsTenTinhThanhVN.add("Binh Thuan");
        dsTenTinhThanhVN.add("Ninh Thuan");
        dsTenTinhThanhVN.add("Nha Trang");

        //B2. Tao adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        //B3. Gan vao dieu khien hien thi ListView
        //3.1, Tim
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 Gan
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3. Lang nghe va xu ly su kien user tuong tac
        //gan bo lang nghe vao
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tao bo lang nghe va xu ly su kien OnItemClick, dat vao mot bien
    //vd: BoLangNghevaXL

    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //code xu ly o day
            // i la vi tri phan tu vua duoc click
            //vd khac, thay vi hien vi tri, ta hien gia tri
            //lay gia tri cua phan tu thu i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, strTenTinhChon, Toast.LENGTH_LONG).show();
        }
    };

}