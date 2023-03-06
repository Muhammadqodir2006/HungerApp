package uz.itschool.hungerapp

import android.graphics.Color

enum class Category(val namE:String, val image:Int, val color : Int) {
    BURGER("Burgers", R.drawable.burgers, Color.parseColor("#FFF599")),
    FRIES("Fries", R.drawable.fries, Color.parseColor("#FF8FB5")),
    DRINK("Drinks", R.drawable.drinks, Color.parseColor("#4AB8AE")),
    PIZZA("Pizzas", R.drawable.pizza, Color.parseColor("#81C7FF")),
    SALAD("Salads", R.drawable.salad, Color.parseColor("#FF968E")),
    FRIED_CHICKEN("Fried chickens", R.drawable.fried_chicken, Color.parseColor("#BD98FF")),
    SANDWICH("sandwiches", R.drawable.sandwich, Color.parseColor("#9DFBB8"))
}