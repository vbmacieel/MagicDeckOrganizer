package com.example.magicdeckorganizer.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.magicdeckorganizer.R
import com.example.magicdeckorganizer.model.CardModel
import com.squareup.picasso.Picasso

class CardsAdapter(
    private val cardsList: List<CardModel>
    ): RecyclerView.Adapter<CardsAdapter.CardsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_item_layout, parent, false)
        return CardsViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardsViewHolder, position: Int) =
        holder.bind(cardsList[position])

    override fun getItemCount(): Int =
        if (cardsList.isEmpty()) 0 else cardsList.size

    inner class CardsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val cardNameText: TextView
        private val cardRarityText: TextView
        private val cardImage: ImageView

        init {
            cardNameText = itemView.findViewById(R.id.card_name)
            cardRarityText = itemView.findViewById(R.id.card_rarity)
            cardImage = itemView.findViewById(R.id.card_image)
        }

        fun bind(card: CardModel) {
            card.apply {
                cardNameText.text = name
                cardRarityText.text = rarity
                Picasso.get().load(imageUrl).into(cardImage)
            }
        }
    }
}