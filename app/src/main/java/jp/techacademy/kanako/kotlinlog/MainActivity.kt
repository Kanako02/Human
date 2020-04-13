package jp.techacademy.kanako.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("タカハシ", 22,"music")
        val human2 = Human("タナカ",20,"comics")

        human.say()
        //Log.d("kotlintest", "私の名前は" + human.name + "です。" + "年は" + human.age + "歳です。")
        //Log.d("kotlintest","私は" + human.hobby + "について考える。")
        human.think()

        human2.say()
       // Log.d("kotlintest", "私の名前は" + human2.name + "です。" + "年は" + human2.age + "歳です。")
        human2.think()

    }
}
