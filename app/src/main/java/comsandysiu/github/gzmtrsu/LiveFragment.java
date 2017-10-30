package comsandysiu.github.gzmtrsu;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Sandy on 2017/10/28.
 */

public class LiveFragment extends Fragment {

    private WebView liveWeb;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live, container, false);
        liveWeb = (WebView)view.findViewById(R.id.webview_live);
        liveWeb.loadUrl("http://ydyc.gzmtr.cn:13050/");

        return view;
    }

}
