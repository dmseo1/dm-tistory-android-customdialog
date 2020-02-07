package com.dongmin.www.customdialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            button.id -> {
                val dlg = MyDialog(this)
                dlg.setOnOKClickedListener{ content ->
                    text.text = content
                }
                dlg.start("메인의 내용을 변경할까요?")
            }
        }
    }
}

