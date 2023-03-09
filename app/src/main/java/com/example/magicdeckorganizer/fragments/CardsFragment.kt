package com.example.magicdeckorganizer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.magicdeckorganizer.R
import com.example.magicdeckorganizer.adapter.CardsAdapter

class CardsFragment: Fragment() {

    private lateinit var cardsRecyclerView: RecyclerView
    private lateinit var cardsAdapter: CardsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.cards_fragment, container, false)
        setUi(view)
        return view
    }

    private fun setUi(view: View) {
        cardsRecyclerView = view.findViewById(R.id.cards_list_recycler_view)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        cardsRecyclerView.layoutManager = GridLayoutManager(context, 3)
        cardsAdapter = CardsAdapter(mutableListOf())
        cardsRecyclerView.adapter = cardsAdapter
    }
}