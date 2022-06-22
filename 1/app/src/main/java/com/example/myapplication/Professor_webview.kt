package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myapplication.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.professeor_webview.*

class Professor_webview : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*교수님 연구실 url 전달받음*/
        if (intent.hasExtra("url")) {
            Toast.makeText(this, intent.getStringExtra("url"), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "전달된 이름이 없습니다", Toast.LENGTH_SHORT).show()
        }

        setContentView(R.layout.professeor_webview)

        professor_intro.settings.javaScriptEnabled = true //자바 스크립트 허용
        professor_intro.settings.allowContentAccess = true
        professor_intro.settings.allowFileAccess = true

        /* 웹뷰에서 새창이 뜨지 않도록 방지하는 구문 */
        professor_intro.webViewClient = WebViewClient()
        professor_intro.webChromeClient = WebChromeClient()
        /*새창이 뜨는게 아니라 앱 내에서 웹페이지 보여줌*/

        professor_intro.loadUrl(intent.getStringExtra("url").toString()) //링크주소 로드
    }

    override fun onBackPressed() {
        if(professor_intro.canGoBack())//웹페이지에서 뒤로갈 페이지가 존재한다면?
        {
            professor_intro.goBack()
        }
        else
        {
            super.onBackPressed() //웹사이트 뒤로가기 적용
        }
    }

}