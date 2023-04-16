package com.example.a07_qa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.a07_qa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    class BtnClkListener : View.OnClickListener {
        override fun onClick(p0: View?) {
            Toast.makeText(p0?.context, "사물함 신청 완료", Toast.LENGTH_LONG).show()
        }
    }
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val strTitle:String = getString(R.string.title)
        binding.textTitle.text = strTitle


        //val clkListener = BtnClkListener()
        //binding.buttonOk.setOnClickListener(clkListener)
        /*val clkListener2 = object:View.OnClickListener{
            override fun onClick(p0: View?) {
                //val msg:String = getString(R.string.okmsg)
                //Toast.makeText(applicationContext, msg , Toast.LENGTH_LONG).show()
                Toast.makeText(applicationContext,R.string.okmsg1,Toast.LENGTH_LONG).show()
            }

        }
        binding.buttonOk.setOnClickListener(clkListener2)*/

       /* binding.buttonOk.setOnClickListener(object :View.OnClickListener{
            override fun OnClick(p0:View?) {
                Toast.makeText(applicationContext,R.string.okmsg1,Toast.LENGTH_LONG).show()
            }
        })
*/
        binding.buttonOk.setOnClickListener{
            /*val msg:String="${(it as TextView).text} ${getString(R.string.okmsg1)}"
            Toast.makeText(applicationContext,R.string.okmsg1,Toast.LENGTH_LONG).show()*/
            with(binding) {
                val strName = editTextName.text.toString().trim()


                if(strName.isEmpty()) {
                    Toast.makeText(applicationContext, "입력 잘 해", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                if(!checkBoxReq.isChecked) { Toast.makeText(applicationContext, "선택잘해", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }

                /*var msg:String = "이름 : ${strName}, "
                when(radioGroupM.checkedRadioButtonId) {
                    R.id.radioButtonCS -> msg +="학과 : 컴퓨터 SW"
                    R.id.radioButtonCI -> msg +="학과 : 컴퓨터 정보공학"
                    R.id.radioButtonAI -> msg +="학과 : 인공지능 SW"
                }
                msg += "\n위의 정보로 신청하였습니다"
                Toast.makeText(applicationContext, msg , Toast.LENGTH_LONG).show()*/
*/
        }
            val radioButton1S = findViewById<RadioButton>(R.id.radioButton1S)
            val radioButton1Y = findViewById<RadioButton>(R.id.radioButton1Y)
                val selectedOption = when {
                    radioButton1S.isChecked -> "1학기 사용"
                    radioButton1Y.isChecked -> "1년 사용"
                    else -> "선택되지 않았습니다."
                }
                val message = "사용 기간: $selectedOption"
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            }

        }
}//oncreate
