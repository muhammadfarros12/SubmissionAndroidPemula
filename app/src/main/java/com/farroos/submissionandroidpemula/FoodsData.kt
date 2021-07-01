package com.farroos.submissionandroidpemula

object FoodsData {

    private val foodNames = arrayOf(
            "Apem",
            "Bika Ambon",
            "Bugis",
            "Cucur",
            "Klepon",
            "Kue Lumpur",
            "Lapis Basah",
            "Onde Wijen",
            "Putu Ayu",
            "Talam"
    )

    private val foodDetails =  arrayOf(
            "Kue berwarna cokelat dengan taburan kelapa parut ini sangat mudah ditemukan di pasar tradisional",
            "Jajanan khas Indonesia  yang berasal dari Medan ini memiliki kelezatan khas yang membuat Anda penasaran. Teksturnya halus dan lembut namun terasa kenyal di mulut.",
            "Kue dengan bungkus pisang ini memiliki isian kelapa parut manis di dalamnya",
            "Kue lembut dengan bentuk bundar ini memang terasa manis dan menggugah selera",
            "Kue bola-bola hijau yang diberi kelapa parut ini memiliki isian gula merah cair",
            "Kue manis ini memiliki bentuk bundar dengan kismis sebagai toppingnya, teksturnya lembut banget!",
            "Tak sulit menemukan lapis basah di pasar tradisional, apalagi dengan varian warna yang cantik",
            "Kue berbentuk bulat yang di bagian luarnya melekat taburan wijen ini tentu sudah tidak asing bagi kebanyakan masyarakat.",
            "Kue berwarna hijau dengan topping parutan kelapa ini bertekstur mirip bolu dengan cita rasa gurih dan manis",
            " Kue yang umumnya terbuat dari beras ini memiliki tekstur lembut dengan cita rasa yang manis dan gurih"
    )

    private val foodImages = intArrayOf(
            R.drawable.apem,
            R.drawable.bika_ambon,
            R.drawable.bugis,
            R.drawable.cucur,
            R.drawable.klepon,
            R.drawable.kuelumpur,
            R.drawable.lapisbasah,
            R.drawable.ondewijen,
            R.drawable.putuayu,
            R.drawable.talam
    )

    val listData: ArrayList<Food>
    get() {
        val list = arrayListOf<Food>()
        for (position in foodNames.indices){
            val food = Food()
            food.name = foodNames[position]
            food.detail = foodDetails[position]
            food.img = foodImages[position]
            list.add(food)
        }
        return list
    }

}