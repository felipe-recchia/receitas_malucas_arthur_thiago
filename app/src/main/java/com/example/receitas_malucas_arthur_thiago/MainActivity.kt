package com.example.receitas_malucas_arthur_thiago

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var ingredientGrid: GridLayout
    private val selectedIngredients = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_selection)

        ingredientGrid = findViewById(R.id.ingredientGrid)
        val proceedButton: Button = findViewById(R.id.proceedButton)

        //botoes
        setupIngredientClick(R.id.image_sugar, "Açúcar")
        setupIngredientClick(R.id.image_chocolate, "Chocolate")
        setupIngredientClick(R.id.image_flour, "Farinha")
        setupIngredientClick(R.id.image_milk, "Leite")
        setupIngredientClick(R.id.image_butter, "Manteiga")
        setupIngredientClick(R.id.image_bat, "Morcego")
        setupIngredientClick(R.id.image_eggs, "Ovos")
        setupIngredientClick(R.id.image_pepper, "Pimenta")
        setupIngredientClick(R.id.image_cheese, "Queijo")
        setupIngredientClick(R.id.image_salt, "Sal")

        proceedButton.setOnClickListener {
            if (selectedIngredients.size == 3) {
                val intent = Intent(this, RecipeActivity::class.java)
                intent.putExtra("selectedIngredients", selectedIngredients.toTypedArray())
                startActivity(intent)
            }
        }
    }

    private fun setupIngredientClick(imageId: Int, ingredientName: String) {
        val imageView: ImageView = findViewById(imageId)
        imageView.setOnClickListener {
            if (selectedIngredients.contains(ingredientName)) {
                selectedIngredients.remove(ingredientName)
                imageView.alpha = 1f // Muda a opacidade para deseleção
            } else {
                if (selectedIngredients.size < 3) {
                    selectedIngredients.add(ingredientName)
                    imageView.alpha = 0.5f // Muda a opacidade para seleção
                }
            }
        }
    }
}
