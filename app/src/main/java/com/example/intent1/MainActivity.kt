package com.example.intent1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.intent1.ui.theme.Intent1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val btnMoveActivity = findViewById<Button>(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener {

            val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
            startActivity(moveIntent)
        }

        val btnMoveWithDataActivity = findViewById<Button>(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener{

            val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
            startActivity(moveWithDataIntent)

        }
    }
}