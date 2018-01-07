package first.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private WebView mywebView;

        // Used to load the 'native-lib' library on application startup.


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mywebView = (WebView)findViewById(R.id.webView);

            WebSettings webSettings = mywebView.getSettings();
           webSettings.setJavaScriptEnabled(true);
            mywebView.loadUrl("https://finalprep.herokuapp.com/");
            mywebView.setWebViewClient(new WebViewClient());
        }

    @Override
    public void onBackPressed() {
        if (mywebView.canGoBack()) {
            mywebView.goBack();
        } else {
            super.onBackPressed();
        }
    }


    /**
         * A native method that is implemented by the 'native-lib' native library,
         * which is packaged with this application.
         */
        public native String stringFromJNI();



    }



