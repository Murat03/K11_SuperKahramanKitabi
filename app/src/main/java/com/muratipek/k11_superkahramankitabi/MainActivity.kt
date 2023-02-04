package com.muratipek.k11_superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.muratipek.k11_superkahramankitabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Veri Hazırlığı

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Batman")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Scarlet Witch")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Aquaman")

        //Verimsiz tanımlamalar
        /*
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val scarletwitchBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.scarlet_witch)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)
        val aquamanBitmap = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)

        var superKahramanGorselleri = ArrayList<Bitmap>()

        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(scarletwitchBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
         */
        val batmanDrawableId = R.drawable.batman
        val supermanDrawableId = R.drawable.superman
        val scarletWitchDrawabaleId = R.drawable.scarlet_witch
        val spidermanDrawableId = R.drawable.spiderman
        val aquamanDrawableId = R.drawable.aquaman

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(batmanDrawableId)
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(scarletWitchDrawabaleId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)

        //Adapter
        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)
        binding.recyclerView.adapter = adapter
    }
}