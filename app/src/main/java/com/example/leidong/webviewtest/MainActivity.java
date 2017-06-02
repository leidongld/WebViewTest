package com.example.leidong.webviewtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    public static final String URL1 = "https://www.baidu.com";
    public static final String URL2 = "https://github.com/";
    public static final String URL3 = "ftp://ftp.sjtu.edu.cn";

    private Button button1, button2, button3;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        initWebView();
        initActions();
    }

    /**
     * 初始化WebView
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void initWebView() {

    }

    /***
     * 初始化动作
     */
    private void initActions() {
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    /**
     * 获取组件
     */
    private void initWidgets() {
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        webView = (WebView) findViewById(R.id.webView);

        button1.setText("Baidu");
        button2.setText("GitHub");
        button3.setText("SJTU FTP");
    }

    /**
     * 按钮点击事件监听
     * @param v 视图
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                clickButton1();
                break;
            case R.id.button2:
                clickButton2();
                break;
            case R.id.button3:
                clickButton3();
                break;
            default:
                break;
        }
    }

    /**
     * 点击按钮3
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void clickButton3() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL3);
    }

    /**
     * 点击按钮2
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void clickButton2() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL2);
    }

    /**
     * 点击按钮1
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void clickButton1() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(URL1);
    }
}
