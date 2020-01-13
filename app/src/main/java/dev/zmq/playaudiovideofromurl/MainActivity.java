package dev.zmq.playaudiovideofromurl;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webAudio();
        webVideo();
    }
    private void webVideo() {
        w=findViewById(R.id.web);
        String about=
                "<html>\n"+ "<body>\n" + "\t<h6>PLAY</h6>\n" + "\t<br>\n" + "<audio " + "class=\"audio\" style=\"width: 100%;display: block;height: auto !important;padding-bottom:0;\""+
                "controls=\"\" autoplay=\"\" name=\"media\">" +
                "<source src=\"http://ia800303.us.archive.org/5/items/Nasser_Al_Qatami_1433/001.mp3\" " +
                "type=\"audio/mpeg\">" +
                "</audio>" +
                "</body>" +
                "</html>";
        TypedArray ta = obtainStyledAttributes(new int[]{
                android.R.attr.textColorPrimary, R.attr.colorAccent});
        String textColor = String.format("#%06X",
                (0xFFFFFF & ta.getColor(1, Color.WHITE)));
        String accentColor = String.format("#%06X",
                (0xFFFFFF & ta.getColor(9, Color.BLUE)));
        ta.recycle();        about = "<style media=\"screen\" type=\"text/css\">" +
                "body {\n" +
                "    color:" + textColor + ";\n" +
                "}\n" +
                "a:link {color:" + accentColor + "}\n" +
                "</style>" + about;
        w.setBackgroundColor(Color.TRANSPARENT);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new MyWebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String Url) {
                return super.shouldOverrideUrlLoading(view, Url);            }
        });        w.getSettings().setRenderPriority( WebSettings.RenderPriority.HIGH);
        w.getSettings().setAppCacheEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        w.getSettings().setUseWideViewPort(true);
        w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        w.getSettings().setAllowUniversalAccessFromFileURLs(true);
        w.setFocusable(true);
        w.setScrollBarStyle(w.SCROLLBARS_OUTSIDE_OVERLAY);
        w.getSettings().getLoadWithOverviewMode();
        w.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        w.getSettings().setDisplayZoomControls(true);
        w.getSettings().setDatabaseEnabled(true);
        w.loadData(about, "text/html", "UTF-8");    }

    private void webAudio() {
        w=findViewById(R.id.wView);
        String about=
                "<html>\n"+
                        "<body>\n" +
                        "\t<h6>PLAY</h6>\n" +
                        "\t<br>\n" +
                        "<video " +
                        "class=\"audio\" style=\"width: 100%;display: block;height: auto !important;padding-bottom:0;\""+
                "controls=\"\" autoplay=\"\" name=\"media\">" +
                "<source src=\"https://video-sin2-1.xx.fbcdn.net/v/t42.9040-2/47361555_329233531223948_8855508624823287808_n.mp4?_nc_cat=101&efg =eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEy4GY9rb-95uGjFGIzUN4JyspjZXXSZmIYckXnfBSr8 _gcAiVkBnotSV45_x5vKQq0e5cNTMZj3h09ThpJcht61mWz6Cl_FiUOH3bhZWKjtw&_nc_ht=video-sin2-1 .xx&oh=3920f3369cfeb0be6c3db27d3eddb96d&oe=5C0A1194\" " +
                "type=\"audio/mpeg\">" +
                "</video>" +
                "</body>" +
                "</html>";
        TypedArray ta = obtainStyledAttributes(new int[]
                {android.R.attr.textColorPrimary, R.attr.colorAccent});
        String textColor = String.format("#%06X",
                (0xFFFFFF & ta.getColor(1, Color.WHITE)));
        String accentColor = String.format("#%06X",
                (0xFFFFFF & ta.getColor(9, Color.BLUE)));
        ta.recycle();        about = "<style media=\"screen\" type=\"text/css\">" +
                "body {\n" +
                "    color:" + textColor + ";\n" +
                "}\n" +
                "a:link {color:" + accentColor + "}\n" +
                "</style>" + about;
        w.setBackgroundColor(Color.TRANSPARENT);
        w.getSettings().setJavaScriptEnabled(true);
        w.setWebViewClient(new MyWebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String Url){
                return super.shouldOverrideUrlLoading(view, Url);
            }
        });
        w.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        w.getSettings().setAppCacheEnabled(true);
        w.getSettings().setDomStorageEnabled(true);
        w.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        w.getSettings().setUseWideViewPort(true);
        w.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        w.getSettings().setAllowUniversalAccessFromFileURLs(true);
        w.setFocusable(true);
        w.setScrollBarStyle(w.SCROLLBARS_OUTSIDE_OVERLAY);
        w.getSettings().getLoadWithOverviewMode();
        w.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        w.getSettings().setDisplayZoomControls(true);
        w.getSettings().setDatabaseEnabled(true);
        w.loadData(about, "text/html", "UTF-8");    }
}