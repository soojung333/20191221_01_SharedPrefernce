package com.soojung.a20191221_01_sharedprefernce.utils

import android.content.Context

class ContextUtil {


    companion object {

        //    우리가 사용할 Preference의 이름 : 메모장으로 치면 - 저장/로드할 파일 이름
        val prefName = "MyProjectPreference"

        //    사용자의 ID를 [저장-set/로드-get]할 때 사용하는 항목의 이름을 상수로 저장.
        val USER_ID = "USER_ID"
        val USER_ID_SAVE = "USER_ID_SAVE"

//    userId를 저장하는 기능을 구현한 함수
        fun setUserId(context: Context, inputId: String) {

//        메모장에서 txt 파일을 여는 것과 같은 행위
//        SharedPreference를 열어준 것
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

//        열어준 preference에 USER_ID 항목에 inputId 변수의 값을 저장 / 확정
            pref.edit().putString(USER_ID, inputId).apply()

        }

        fun getUserId(context: Context) : String {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)

            return pref.getString(USER_ID, " ")!!
        }

        fun setUserIdSave(context: Context, needSave:Boolean) {
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putBoolean(USER_ID_SAVE, needSave).apply()
        }

        fun getUserIdSave(context: Context) : Boolean{
            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getBoolean(USER_ID_SAVE, false)

        }



    }

}