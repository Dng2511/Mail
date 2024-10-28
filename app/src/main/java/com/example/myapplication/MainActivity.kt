package com.example.myapplication
// MainActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Tạo danh sách email mẫu
        val emailList = listOf(
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("alice@example.com", "Meeting Reminder", "Don't forget our meeting tomorrow."),
            Email("bob@example.com", "Hello!", "Just wanted to say hi."),
            Email("charlie@example.com", "Invoice for your purchase", "Thank you for your purchase. Please see the attached invoice.")
        )

        // Thiết lập RecyclerView với Adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}
