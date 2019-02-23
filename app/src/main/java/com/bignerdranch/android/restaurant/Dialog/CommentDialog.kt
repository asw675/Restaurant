package com.bignerdranch.android.restaurant.Dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import com.bignerdranch.android.restaurant.R
import kotlinx.android.synthetic.main.dialog_comment.*

class CommentDialog(context: Context?,listener:ReCommentListener) : Dialog(context) {

    val listener=listener
    interface ReCommentListener{
        fun ReComment(string: String)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view: View =View.inflate(context, R.layout.dialog_comment,null)
        setContentView(view)
        button.setOnClickListener {
            dismiss()
            listener.ReComment(comment.text.toString())
        }
    }
}