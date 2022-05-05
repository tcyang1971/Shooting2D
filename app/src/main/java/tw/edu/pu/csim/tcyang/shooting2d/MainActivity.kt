package tw.edu.pu.csim.tcyang.shooting2d

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var img : ImageView
    lateinit var game : Game
    var flag:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.img)
        game = findViewById(R.id.game)

        img.setOnClickListener({
            if (flag){
                flag = false
                img.setImageResource(R.drawable.start)
            }
            else{
                flag = true
                img.setImageResource(R.drawable.stop)
            }

        })
    }
}