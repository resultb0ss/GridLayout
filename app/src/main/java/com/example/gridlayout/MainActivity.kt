package com.example.gridlayout

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gridlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.oneButtonBTN.setOnClickListener(::onClick)
        binding.twoButtonBTN.setOnClickListener(::onClick)
        binding.threeButtonBTN.setOnClickListener(::onClick)
        binding.fourButtonBTN.setOnClickListener(::onClick)
        binding.fiveButtonBTN.setOnClickListener(::onClick)
        binding.sixButtonBTN.setOnClickListener(::onClick)
        binding.sevenButtonBTN.setOnClickListener(::onClick)
        binding.eightButtonBTN.setOnClickListener(::onClick)
        binding.nineButtonBTN.setOnClickListener(::onClick)
        binding.zeroButtonBTN.setOnClickListener(::onClick)
        binding.plusButtonBTN.setOnClickListener(::onClick)
        binding.minusButtonBTN.setOnClickListener(::onClick)
        binding.shareButtonBTN.setOnClickListener(::onClick)
        binding.multiplyButtonBTN.setOnClickListener(::onClick)
        binding.equallyButtonBTN.setOnClickListener(::onClick)
        binding.resetButtonBTN.setOnClickListener(::onClick)

        binding.exitButton.setOnClickListener{
            finish()
        }

    }

    private fun onClick(view: View){
        var result = 0
        var stringResult = ""
        when(view){
            binding.oneButtonBTN -> binding.mainActivityEditTextET.append("1")
            binding.twoButtonBTN -> binding.mainActivityEditTextET.append("2")
            binding.threeButtonBTN -> binding.mainActivityEditTextET.append("3")
            binding.fourButtonBTN -> binding.mainActivityEditTextET.append("4")
            binding.fiveButtonBTN -> binding.mainActivityEditTextET.append("5")
            binding.sixButtonBTN -> binding.mainActivityEditTextET.append("6")
            binding.sevenButtonBTN -> binding.mainActivityEditTextET.append("7")
            binding.eightButtonBTN -> binding.mainActivityEditTextET.append("8")
            binding.nineButtonBTN -> binding.mainActivityEditTextET.append("9")
            binding.zeroButtonBTN ->binding.mainActivityEditTextET.append("0")
            binding.plusButtonBTN -> binding.mainActivityEditTextET.append("+")
            binding.minusButtonBTN -> binding.mainActivityEditTextET.append("-")
            binding.multiplyButtonBTN ->binding.mainActivityEditTextET.append("*")
            binding.shareButtonBTN -> binding.mainActivityEditTextET.append("/")
            binding.resetButtonBTN -> {
                binding.mainActivityEditTextET.text.clear()
                binding.mainActivityTextVieResultTV.text = ""
            }

            binding.equallyButtonBTN -> {

                stringResult = binding.mainActivityEditTextET.text.toString()
                if (stringResult.contains("+")) {

                    var numOne = stringResult.split("+")[0].toInt()
                    var numTwo = stringResult.split("+")[1].toInt()
                    result = numOne + numTwo
                    binding.mainActivityTextVieResultTV.text = result.toString()

                } else if (stringResult.contains("-")){

                    var numOne = stringResult.split("-")[0].toInt()
                    var numTwo = stringResult.split("-")[1].toInt()
                    result = numOne - numTwo
                    binding.mainActivityTextVieResultTV.text = result.toString()

                } else if(stringResult.contains("*")){

                    var numOne = stringResult.split("*")[0].toInt()
                    var numTwo = stringResult.split("*")[1].toInt()
                    result = numOne * numTwo
                    binding.mainActivityTextVieResultTV.text = result.toString()

                } else if(stringResult.contains("/")) {

                    var numOne = stringResult.split("/")[0].toInt()
                    var numTwo = stringResult.split("/")[1].toInt()
                    result = numOne / numTwo
                    binding.mainActivityTextVieResultTV.text = result.toString()

                } else {
                    binding.mainActivityTextVieResultTV.text = "Ошибка"
                }

            }

        }
    }
}