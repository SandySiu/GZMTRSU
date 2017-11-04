package comsandysiu.github.gzmtrsu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static comsandysiu.github.gzmtrsu.Infomation.*;

/**
 * Created by Sandy on 2017/11/5.
 */

public class InfoListAdapter extends BaseAdapter {

    private List<Infomation> mInfo;
    private LayoutInflater mInflater;

    public InfoListAdapter (List<Infomation> info,LayoutInflater inflater){
        mInfo = info;
        mInflater = inflater;
    }

    @Override
    public int getCount() {
        return mInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup viewGroup) {
        //获得ListView中的view
        View view = mInflater.inflate(R.layout.style_infolist,null);
        //获得学生对象
        Infomation info = mInfo.get(position);
        //获得自定义布局中每一个控件的对象。
        //ImageView statueIcon
        TextView statueText = (TextView)view.findViewById(R.id.statue);
        TextView lineText = (TextView)view.findViewById(R.id.line);
        TextView dateText = (TextView)view.findViewById(R.id.date);
        //将数据一一添加到自定义的布局中。
        //statueIcon.setImageResource();
        statueText.setText(info.getmStatue());
        lineText.setText(info.getmLine());
        dateText.setText(info.getmDate());
        return view;
    }

}
