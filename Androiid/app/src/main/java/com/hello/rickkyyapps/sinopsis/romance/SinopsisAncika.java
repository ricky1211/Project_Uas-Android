package com.hello.rickkyyapps.sinopsis.romance;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.hello.rickkyyapps.R;

public class SinopsisAncika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopsis_ancika); // Assuming you have an XML layout file for this activity

        WebView webView1 = findViewById(R.id.webView1);
        String video1 = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DbOa2bGLNWA\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView1.loadData(video1, "text/html", "utf-8");
        webView1.getSettings().setJavaScriptEnabled(true);
        webView1.setWebChromeClient(new WebChromeClient());
    }
}
