package com.example.m5hw1

class CounterModel {

    private var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getResult() = count
}