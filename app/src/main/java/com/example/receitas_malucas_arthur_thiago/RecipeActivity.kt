package com.example.receitas_malucas_arthur_thiago

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_display)
        val result = StringBuilder()

        val recipeTitleTextView: TextView = findViewById(R.id.recipeTitleTextView)
        val recipeImageView: ImageView = findViewById(R.id.recipeImageView)
        val selectedIngredientsTextView: TextView = findViewById(R.id.selectedIngredientsTextView)
        val recipeStepsTextView: TextView = findViewById(R.id.recipeStepsTextView)
        val shareButton: Button = findViewById(R.id.shareButton)

        val selectedIngredients = intent.getStringArrayExtra("selectedIngredients")
        selectedIngredientsTextView.text = selectedIngredients?.joinToString(", ")

        val imagens = listOf(
            R.drawable.receita1, R.drawable.receita2,
            R.drawable.receita3, R.drawable.receita4, R.drawable.receita5
        )

        val randomImage = imagens[Random.nextInt(imagens.size)]

        recipeImageView.setImageResource(randomImage)

        var ingredient1 = ""
        var ingredient2 = ""
        var ingredient3 = ""

        val selectedIngredientsIterable = intent.getStringArrayExtra("selectedIngredients") ?: arrayOf()

        for ((index, ingredient) in selectedIngredientsIterable.withIndex()) {
            when (index) {
                0 -> ingredient1 = ingredient
                1 -> ingredient2 = ingredient
                2 -> ingredient3 = ingredient
            }
        }
//        val ingrediente1 = intent.getStringExtra("ingrediente1") ?: "Ingrediente 1"
//        val ingrediente2 = intent.getStringExtra("ingrediente2") ?: "Ingrediente 2"
//        val ingrediente3 = intent.getStringExtra("ingrediente3") ?: "Ingrediente 3"


        val receita = gerarReceita(this, ingredient1, ingredient2, ingredient3)
        recipeStepsTextView.text = receita;
        shareButton.setOnClickListener {
            shareRecipe()
        }
    }

    private fun shareRecipe() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Confira essa receita incrível!")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Compartilhar receita via"))
    }
}
