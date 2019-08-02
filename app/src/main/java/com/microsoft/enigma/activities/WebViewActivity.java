package com.microsoft.enigma.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.microsoft.enigma.R;
import com.microsoft.enigma.models.UserModel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Map;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;
    private final static String VOTER_SEARCH_URL = "https://electoralsearch.in/";
    private final static String VOTER_RESULT_URL = "https://electoralsearch.in/##resultArea";
    private final static String JAVASCRIPT_QUERY = "javascript:window.HTMLOUT.processHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getWindow().requestFeature(Window.FEATURE_PROGRESS);
        setContentView(R.layout.web_activity);
        webView = (WebView) findViewById(R.id.webView);

        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.addJavascriptInterface(new ContentParser(), "HTMLOUT");

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(final WebView view, String url) {
                if (url.startsWith(VOTER_RESULT_URL))
                    webView.post(() -> webView.loadUrl(JAVASCRIPT_QUERY));
            }
        });
        webView.loadUrl(VOTER_SEARCH_URL);
    }

    class ContentParser {
        @JavascriptInterface
        @SuppressWarnings("unused")
        public void processHTML(String html) {
            Map<String, String> userDataMap = new HashMap<>();
            Document doc = Jsoup.parse(html);
            Element result = doc.getElementById("resultsTable");
            if(result == null) {
                Toast.makeText(WebViewActivity.this, "Invalid Input", Toast.LENGTH_LONG).show();
                return;
            }
            Elements userData = result.select("input[type=hidden]");
            for(Element elem : userData) {
                userDataMap.put(elem.attr("name"), elem.attr("value"));
                Log.d(elem.attr("name"), elem.attr("value"));
            }
            UserModel.populateBySignUp(userDataMap);
        }
    }
}
