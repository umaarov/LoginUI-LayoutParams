package uz.umarov.loginlayoutparams

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.gravity = Gravity.CENTER
        linearLayout.setBackgroundColor(Color.WHITE)
        linearLayout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )

        val editTextName = EditText(this)
        val nameLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        nameLayoutParams.setMargins(48, 0, 48, 16)
        editTextName.layoutParams = nameLayoutParams
        editTextName.hint = "Enter username"
        editTextName.setTextColor(Color.BLACK)
        editTextName.setBackgroundResource(R.drawable.edit_text_background)
        linearLayout.addView(editTextName)

        val editTextPassword = EditText(this)
        val passwordLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        passwordLayoutParams.setMargins(48, 0, 48, 16)
        editTextPassword.layoutParams = passwordLayoutParams
        editTextPassword.hint = "Enter password"
        editTextPassword.setTextColor(Color.BLACK)
        editTextPassword.setBackgroundResource(R.drawable.edit_text_background)
        linearLayout.addView(editTextPassword)

        val buttonLogin = Button(this)
        val loginLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        loginLayoutParams.setMargins(48, 0, 48, 16)
        buttonLogin.layoutParams = loginLayoutParams
        buttonLogin.text = "Login"
        buttonLogin.setTextColor(Color.WHITE)
        buttonLogin.setBackgroundResource(R.drawable.button_background)
        linearLayout.addView(buttonLogin)

        val textViewOutput = TextView(this)
        textViewOutput.gravity = Gravity.CENTER
        val outputLayoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        textViewOutput.layoutParams = outputLayoutParams
        linearLayout.addView(textViewOutput)

        setContentView(linearLayout)

        buttonLogin.setOnClickListener {
            val username = editTextName.text.toString()
            val password = editTextPassword.text.toString()

            val output = "Username: $username\nPassword: $password"
            textViewOutput.text = output
        }
    }
}
