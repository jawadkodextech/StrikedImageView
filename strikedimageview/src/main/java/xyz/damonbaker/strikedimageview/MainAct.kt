package xyz.damonbaker.strikedimageview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainAct:AppCompatActivity() {
    private lateinit var strikeImage :StrikedImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)
        strikeImage = findViewById(R.id.rlStrike)
        strikeImage.setOnClickListener {
            strikeImage.isStriked = !strikeImage.isStriked
        }
    }
}