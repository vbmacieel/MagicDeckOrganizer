package com.example.magicdeckorganizer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.magicdeckorganizer.R

class DecksFragment: Fragment() {

    private lateinit var noDecksText: TextView
    private lateinit var decksRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.decks_fragment, container, false)
        setUi(view)
        return view
    }

    private fun setUi(view: View) {
        noDecksText = view.findViewById(R.id.no_decks_text)
        decksRecyclerView = view.findViewById(R.id.decks_recycler_view)
        noDecksText.visibility = View.INVISIBLE
    }
}