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
}