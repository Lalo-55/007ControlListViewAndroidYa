package com.luismorales17106494.a007_controllistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.luismorales17106494.a007_controllistview.databinding.ActivityMainBinding

/*
    7 - Control ListView (con una lista de String)

    El control ListView a diferencia del Spinner que se cierra luego de seleccionar un elemento
    permanecen visibles varios elementos (se lo utiliza cuando hay que mostrar una lista de
    elementos similares)
    En este primer ejemplo mostraremos una lista de String (es decir cada elemento de la lista
    es un String, veremos más adelante que podemos tener listas de objetos de otro tipo: imágenes,
    íconos, varios String por elemento etc.)
    Si la lista no entra en el espacio que hemos fijado para el ListView nos permite hacer scroll
    de los mismos.
    El control ListView se encuentra en la pestaña "Containers".


    Problema
    Disponer un ListView con los nombres de paises de sudamérica. Cuando se seleccione un
    país mostrar en un TextView la cantidad de habitantes del país seleccionado.
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Listapaises = arrayOf( "Argentina", "Chile", "Paraguay", "Bolivia", "Peru", "Ecuador", "Brasil", "Colombia", "Venezuela", "Uruguay")
        var habitantes = arrayOf(40_000_000, 17_000_000, 6_500_000, 10_000_000, 30_000_000, 14_000_000, 183_000_000, 44_000_000, 31_000_000, 3_500_000)


        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Listapaises)
        binding.lvListaPaises.adapter = adapter


        binding.lvListaPaises.setOnItemClickListener{ adapterView, view , item, l ->

            binding.tvNumeroDeHabitantes.text = "${Listapaises[item]} : ${habitantes[item]} habitantes"

        }

    }
}