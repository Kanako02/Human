package jp.techacademy.kanako.kotlinlog

import android.util.Log

class BigDog: Dog {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int) : super(name, age) {
    }

    override fun say() {
        super.say()
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}
