package com.example.project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()

        items.add(Item(1, "sofa", "Диван", "Зручний диван для вашого будинку", "Цей стильний та зручний диван стане прекрасним доповненням вашого інтер'єру. Виготовлений з високоякісних матеріалів, він забезпечить комфорт та затишок в вашій вітальні.", 14999))
        items.add(Item(2, "chair", "Крісло", "Стильне крісло для вітальні", "Це крісло - ідеальний вибір для вашого вітального простору. Його сучасний дизайн та зручна конструкція додадуть вашій кімнаті елегантності та затишку.", 6999))
        items.add(Item(3, "table", "Стіл", "Функціональний стіл для кухні", "Цей стіл ідеально підійде для вашої кухні. З його просторою поверхнею та міцною конструкцією ви зможете зручно приймати їжу та проводити час з родиною.", 11999))
        items.add(Item(4, "lamp", "Лампа", "Елегантна лампа для освітлення", "Ця лампа не лише освітить ваш простір, але й додасть йому стильності та елегантності. З її допомогою ви зможете створити атмосферу затишку та комфорту у будь-якій кімнаті.", 999))
        items.add(Item(5, "shelf", "Полиця", "Простора полиця для книг", "Ця полиця стане відмінним рішенням для зберігання ваших улюблених книг та декоративних предметів. Зручні розміри та міцна конструкція зроблять ваш інтер'єр більш організованим та затишним.", 1999))
        items.add(Item(6, "bed", "Ліжко", "Затишне ліжко для спальні", "Це ліжко стане ідеальним місцем для відпочинку та відновлення сил після важкого дня. Його комфортна конструкція та сучасний дизайн забезпечать вам спокійний сон та зарядять енергією на наступний день.", 21999))
        items.add(Item(7, "rug", "Килим", "М'який килим для вітальні", "Цей килим додасть вашій вітальні тепла та затишку. Виготовлений з високоякісних матеріалів, він не лише прикрасить ваш простір, але й зробить його більш комфортним для проживання.", 1399))
        items.add(Item(8, "cabinet", "Шафа", "Вмістлива шафа для одягу", "Ця шафа стане ідеальним вибором для зберігання вашого одягу та аксесуарів. З її допомогою ви зможете організувати ваш гардероб та зберегти ваші речі в порядку.", 16999))
        items.add(Item(9, "mirror", "Дзеркало", "Елегантне дзеркало для ванної", "Це дзеркало додасть вашій ванній кімнаті елегантності та стилю. З його допомогою ви зможете створити ілюзію більшого простору та насолоджуватись відображенням кожен день.", 3999))
        items.add(Item(10, "desk", "Письмовий стіл", "Функціональний письмовий стіл для офісу", "Цей стіл ідеально підійде для вашого офісу чи домашньої робочої зони. З його допомогою ви зможете зручно працювати та організовувати ваші робочі процеси.", 7999))


        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}