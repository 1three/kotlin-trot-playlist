package com.three.trot_playlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        // RecyclerView 연결
        val items = mutableListOf<String>()
        items.add("가인이어라")
        items.add("거문고야")
        items.add("엄마아리랑")
        items.add("서울의 달")
        items.add("오늘같이 좋은 날")
        items.add("진정인가요")
        items.add("어머님 사랑합니다")
        items.add("내 마음의 사진")
        items.add("당신을 만나")
        items.add("월하가약")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.img1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }
        view.findViewById<ImageView>(R.id.img3).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }
}