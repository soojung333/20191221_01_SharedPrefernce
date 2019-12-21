package com.soojung.a20191221_01_sharedprefernce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.soojung.a20191221_01_sharedprefernce.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()

        loginBtn.setOnClickListener {
            if (idCheckBox.isChecked) {
                val userId = idEdt.text.toString()

                ContextUtil.setUserId(mContext, userId)


            }
        }



    }


    override fun setupEvents() {

//        Q1. 아이디 저장 로직 구현
//        loginBtn 이 눌리면
//        idCheckBox 가 체크되어 있는지 검사
//        되어 있다면 edEdt 에 적혀 있는 값을 userId 라는 val로 저장


//        Q2. 아이디 저장 체크박스 체크여부 (boolean) 저장
//        idCheckBox 가 체크 되면 (구글링)
//        체크 된 값 (체크/해제)을 ContextUtil - SharePreference 활용해서 저장
//        앱이 켜질 때 setValues 에서 저장된 체크 여부를 반영 (구글링)

        idCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->

            ContextUtil.setUserIdSave(mContext, isChecked)

        }


    }

    override fun setValues() {
        idEdt.setText(ContextUtil.getUserId(mContext))

        idCheckBox.isChecked = ContextUtil.getUserIdSave(mContext)

    }


}
