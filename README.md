
# Rapport

La till uses-premission för internet i Androidmanifest.xml.
I activity_main.xml ändrade jag textview till webview och la till ett id my_webview".
Gjorde en privat variabel i MainActivity.java som heter myWebView.
Lokaliserade webview genom id "my_webview".
Gjorde en webviewcliet och kopplade den till mywebview.
Aktivera Javascript.
La till en extern webbsida "www.his.se".

## Följande grundsyn gäller dugga-svar:



```
<uses-permission android:name="android.permission.INTERNET" />

android:id="@+id/my_webview"

private WebView myWebView;

myWebView = findViewById(R.id.my_webview);

myWebView.setWebViewClient(new WebViewClient());

myWebView.getSettings().setJavaScriptEnabled(true);

myWebView.loadUrl("https://his.se");


```

Bilder läggs i samma mapp som markdown-filen.


![](android.png) 

