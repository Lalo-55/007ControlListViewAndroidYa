package com.luismorales17106494.a007_controllistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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


 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}