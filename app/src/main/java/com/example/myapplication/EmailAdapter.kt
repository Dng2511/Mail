package com.example.myapplication

// EmailAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) :
    RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView = itemView.findViewById(R.id.tvSender)
        val subjectTextView: TextView = itemView.findViewById(R.id.tvSubject)
        val snippetTextView: TextView = itemView.findViewById(R.id.tvSnippet)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_item, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderTextView.text = email.sender
        holder.subjectTextView.text = email.subject
        holder.snippetTextView.text = email.snippet
    }

    override fun getItemCount(): Int {
        return emailList.size
    }
}
