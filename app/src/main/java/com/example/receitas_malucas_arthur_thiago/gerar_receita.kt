package com.example.receitas_malucas_arthur_thiago

import android.content.Context
import kotlin.random.Random


    fun gerarReceita(context: Context, ingrediente1: String, ingrediente2: String, ingrediente3: String): String {
        val receitas = listOf(
            R.string.receita1, R.string.receita2, R.string.receita3, R.string.receita4, R.string.receita5,
            R.string.receita6, R.string.receita7, R.string.receita8, R.string.receita9, R.string.receita10,
            R.string.receita11, R.string.receita12, R.string.receita13, R.string.receita14, R.string.receita15,
            R.string.receita16, R.string.receita17, R.string.receita18, R.string.receita19, R.string.receita20,
            R.string.receita21, R.string.receita22, R.string.receita23, R.string.receita24, R.string.receita25,
            R.string.receita26, R.string.receita27, R.string.receita28, R.string.receita29, R.string.receita30,
            R.string.receita31, R.string.receita32, R.string.receita33, R.string.receita34, R.string.receita35,
            R.string.receita36, R.string.receita37, R.string.receita38, R.string.receita39, R.string.receita40,
            R.string.receita41, R.string.receita42, R.string.receita43, R.string.receita44, R.string.receita45
        )

        val receitaEscolhida = receitas[Random.nextInt(receitas.size)]

        val imagens = listOf(
            R.drawable.receita1, R.drawable.receita2,
            R.drawable.receita3, R.drawable.receita4, R.drawable.receita5
        )

        val randomImage = imagens[Random.nextInt(imagens.size)]

        return when (receitaEscolhida) {
            R.string.receita1 -> String.format(context.getString(R.string.receita1_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita2 -> String.format(context.getString(R.string.receita2_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita3 -> String.format(context.getString(R.string.receita3_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita4 -> String.format(context.getString(R.string.receita4_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita5 -> String.format(context.getString(R.string.receita5_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita6 -> String.format(context.getString(R.string.receita6_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita7 -> String.format(context.getString(R.string.receita7_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita8 -> String.format(context.getString(R.string.receita8_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita9 -> String.format(context.getString(R.string.receita9_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita10 -> String.format(context.getString(R.string.receita10_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita11 -> String.format(context.getString(R.string.receita11_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita12 -> String.format(context.getString(R.string.receita12_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita13 -> String.format(context.getString(R.string.receita13_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita14 -> String.format(context.getString(R.string.receita14_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita15 -> String.format(context.getString(R.string.receita15_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita16 -> String.format(context.getString(R.string.receita16_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita17 -> String.format(context.getString(R.string.receita17_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita18 -> String.format(context.getString(R.string.receita18_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita19 -> String.format(context.getString(R.string.receita19_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita20 -> String.format(context.getString(R.string.receita20_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita21 -> String.format(context.getString(R.string.receita21_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita22 -> String.format(context.getString(R.string.receita22_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita23 -> String.format(context.getString(R.string.receita23_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita24 -> String.format(context.getString(R.string.receita24_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita25 -> String.format(context.getString(R.string.receita25_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita26 -> String.format(context.getString(R.string.receita26_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita27 -> String.format(context.getString(R.string.receita27_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita28 -> String.format(context.getString(R.string.receita28_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita29 -> String.format(context.getString(R.string.receita29_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita30 -> String.format(context.getString(R.string.receita30_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita31 -> String.format(context.getString(R.string.receita31_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita32 -> String.format(context.getString(R.string.receita32_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita33 -> String.format(context.getString(R.string.receita33_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita34 -> String.format(context.getString(R.string.receita34_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita35 -> String.format(context.getString(R.string.receita35_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita36 -> String.format(context.getString(R.string.receita36_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita37 -> String.format(context.getString(R.string.receita37_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita38 -> String.format(context.getString(R.string.receita38_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita39 -> String.format(context.getString(R.string.receita39_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita40 -> String.format(context.getString(R.string.receita40_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita41 -> String.format(context.getString(R.string.receita41_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita42 -> String.format(context.getString(R.string.receita42_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita43 -> String.format(context.getString(R.string.receita43_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita44 -> String.format(context.getString(R.string.receita44_text), ingrediente1, ingrediente2, ingrediente3)
            R.string.receita45 -> String.format(context.getString(R.string.receita45_text), ingrediente1, ingrediente2, ingrediente3)
            else -> "Receita desconhecida!"
        }
    }
