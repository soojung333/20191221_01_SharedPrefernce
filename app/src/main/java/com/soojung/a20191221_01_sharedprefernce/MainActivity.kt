package com.soojung.a20191221_01_sharedprefernce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.soojung.a20191221_01_sharedprefernce.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        loginBtn.setOnClickListener {
            if (idCeckBox.isChecked) {
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext, userId)


            }
        }


    }


    override fun setupEvents() {

//        Q1. 아이디 저장 로직 구현
//        loginBtn이 눌리면
//        idCheckBox가 체크되어 있는지 검사
//        되어 있다면 edEdt에 적혀 있는 값을 userId 라는 val로 저장



    }

    override fun setValues() {

    }


}
