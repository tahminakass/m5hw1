package com.example.m5hw1

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.m5hw1.databinding.ActivityCounterBinding

class CounterActivity : AppCompatActivity(), CounterContract {
    private val presenter = CounterPresenter()
    private val binding by lazy { ActivityCounterBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        presenter.attachCounterContract(this)

        binding.btnDecrement.setOnClickListener {
            presenter.onDecrement()
        }

        binding.btnIncrement.setOnClickListener {
            presenter.onIncrement()
        }
    }

    override fun showResult(count: Int) {
        binding.tvResult.text = count.toString()
    }


    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun changeTextColorToGreen() {
        binding.tvResult.setTextColor(Color.GREEN)
    }
}