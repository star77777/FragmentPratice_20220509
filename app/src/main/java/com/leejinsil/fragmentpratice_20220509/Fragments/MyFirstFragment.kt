package com.leejinsil.fragmentpratice_20220509.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leejinsil.fragmentpratice_20220509.R

//()하니까 오류가 없어지는 걸 보니 안에 안적어줘도 된다
class MyFirstFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //루트에까지 파일을 붙일꺼니?
        return inflater.inflate(R.layout.fragment_myfirst,container, false)
    }

    
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        이 프래그먼트를 들고있는 액티비티가 완전히 만들어진 시점
//        (activity 생명주기 활용)> 다른 함수로 바꿔서 설명 예정
        // 이벤트 처리,데이터 보여주기 등등 "동작"
        //프래그먼트를 액티비티와 사용법이 비슷하다
    }
}