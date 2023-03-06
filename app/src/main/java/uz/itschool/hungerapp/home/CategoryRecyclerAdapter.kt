package uz.itschool.hungerapp.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.itschool.hungerapp.Category
import uz.itschool.hungerapp.R

class CategoryRecyclerAdapter : RecyclerView.Adapter<CategoryRecyclerAdapter.MyViewHoler>() {

    class MyViewHoler(itemView: View) : RecyclerView.ViewHolder(itemView){
        var card = itemView.findViewById<CardView>(R.id.card)
        var nomi = itemView.findViewById<TextView>(R.id.nomi)
        var image = itemView.findViewById<ImageView>(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoler {
        return MyViewHoler(LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHoler, position: Int) {
        val category = Category.values()[position]
        holder.image.setImageResource(category.image)
        holder.nomi.text = category.namE
        holder.card.setCardBackgroundColor(category.color)
    }

    override fun getItemCount(): Int {
        return Category.values().size
    }


}