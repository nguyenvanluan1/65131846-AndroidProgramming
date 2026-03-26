package tiil.edu.baith8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    //
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;
    //ham tao


    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.context = _context;
        this.dsMonAn = dsMonAn;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //View item hien hanh
        View viewHienHanh = view;
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        //lay du lieu
        MonAn MonAnHienTai = dsMonAn.get(i);
        //Gan len cac dieu khien

        //tim dieu khien
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAnh);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);

        //set len
        textView_TenMon.setText(MonAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(MonAnHienTai.getDonGia()));
        textView_MoTa.setText(MonAnHienTai.getMoTa());
        imageView_Anh.setImageResource(MonAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;

    }
}
