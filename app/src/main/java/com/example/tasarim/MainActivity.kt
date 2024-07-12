package com.example.tasarim

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Buradaki R harfi res klasörünü temsil etmektedir.
        // Xml kısmında @ işareti res klasörünü temsil eder.
        // https://www.materialpalette.com/ sitesinden istediğin renklerle uygulamanı gçrüntüsünü güzelleştirebilrsin.
        // https://color.adobe.com/tr/search?q=pizza bu sitede istediğin şeye göçre renk üretimi

        // left  - start - leading nesnenin sol tarfının ifade ediliş biçimleridir.

        // right  - end - trailing nesnenin sağ tarafını ifade eder.

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}