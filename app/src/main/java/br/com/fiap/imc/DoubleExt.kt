package br.com.fiap.imc

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)

