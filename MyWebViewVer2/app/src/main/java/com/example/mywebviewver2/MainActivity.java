package com.example.mywebviewver2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    private WebView webV1;
    private WebView webV2;
    private WebView webV3;
    private WebView webV4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Button btnPrev,btnNext;
        final ViewFlipper vFlipper;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btnPrev = (Button) findViewById(R.id.btnPrev);
        btnNext = (Button) findViewById(R.id.btnNext);
        vFlipper = (ViewFlipper) findViewById(R.id.viewFlip);

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showPrevious();
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vFlipper.showNext();
            }
        });

        webV1 = (WebView) findViewById(R.id.webViewOne);
        webV2 = (WebView) findViewById(R.id.webViewTwo);
        webV3 = (WebView) findViewById(R.id.webViewThree);
        webV4 = (WebView) findViewById(R.id.webViewFour);


        webV1.getSettings().setJavaScriptEnabled(true);
        webV1.loadUrl("http://yflower.dothome.co.kr/main/");
        webV1.setWebChromeClient(new WebChromeClient());
        webV1.setWebViewClient(new WebViewClientClass());

        webV2.getSettings().setJavaScriptEnabled(true);
        webV2.loadUrl("http://dusrrhc22.dothome.co.kr/main/");
        webV2.setWebChromeClient(new WebChromeClient());
        webV2.setWebViewClient(new WebViewClientClass());

        webV3.getSettings().setJavaScriptEnabled(true);
        webV3.loadUrl("http://dusdusrrhc.dothome.co.kr/main/");
        webV3.setWebChromeClient(new WebChromeClient());
        webV3.setWebViewClient(new WebViewClientClass());

        webV4.getSettings().setJavaScriptEnabled(true);
        webV4.loadUrl("https://github.com/99qkrtjdus");
        webV4.setWebChromeClient(new WebChromeClient());
        webV4.setWebViewClient(new WebViewClientClass());



    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {//뒤로가기 버튼 이벤트
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV1.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV1.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV2.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV2.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV3.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV3.goBack();
            return true;
        }
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webV4.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            webV4.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
