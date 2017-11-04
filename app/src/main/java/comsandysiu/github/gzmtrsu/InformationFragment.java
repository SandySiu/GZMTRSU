package comsandysiu.github.gzmtrsu;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sandy on 2017/10/28.
 */

public class InformationFragment extends Fragment {

    private ListView infoList;
    private List<Infomation> mInfo;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_information, container, false);
        //load list
        infoList = (ListView)getView().findViewById(R.id.infolist);
        LayoutInflater itemInflater = getLayoutInflater();
        initData();
        InfoListAdapter listAdapt = new InfoListAdapter(mInfo,itemInflater);
        infoList.setAdapter(listAdapt);
        return  view;
    }

    private void initData() {
        mInfo = new ArrayList<Infomation>();
        Infomation APM = new Infomation("部分停运","APM线","11-04");
        Infomation SC = new Infomation("安检升级","东湖等20个车站","10-15");
        Infomation Line1 = new Infomation("列车延误","一号线","10-12");
    }


}
