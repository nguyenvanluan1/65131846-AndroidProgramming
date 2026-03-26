package tiil.edu.baith8;

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
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

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
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        //chuan bi nguon du lieu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add( new MonAn("Cơm tấm sườn", 25000, "Mô tả ở đây", R.drawable.cs));
        dsMonAn.add( new MonAn("Cơm sườn trứng", 27000, "Mô tả ở đây", R.drawable.st));
        dsMonAn.add( new MonAn("Cơm tấm sườn bì chả", 30000, "Mô tả ở đây", R.drawable.sb));
        dsMonAn.add( new MonAn("Cơm gà xối mỡ ", 30000, "Mô tả ở đây", R.drawable.cg));
        dsMonAn.add( new MonAn("Cơm tấm đặc biệt", 35000, "Mô tả ở đây", R.drawable.db));

        //
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        //bat xu ly su kien
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //lay phan tu duoc chon
                MonAn monAnChon = dsMonAn.get(i);
                //lam
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}