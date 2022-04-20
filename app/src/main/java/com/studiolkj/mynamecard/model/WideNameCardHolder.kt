package com.studiolkj.mynamecard.model

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.mazenrashed.printooth.data.printable.ImagePrintable
import com.mazenrashed.printooth.data.printable.Printable
import com.mazenrashed.printooth.data.printer.DefaultPrinter
import com.studiolkj.mynamecard.R

class WideNameCardHolder: NameCardHolder() {
    override fun getNameCard(context: Context): ArrayList<Printable>{
        myNameCardDatas.add(getWideNameCard(context))
        myNameCardDatas.add(getMargin())
        return myNameCardDatas
    }

    private fun getWideNameCard(context: Context): Printable {
        val bitmap  = BitmapFactory.decodeResource(context.getResources(), R.drawable.img_wide_namecard)
        val wideBitmap = Bitmap.createScaledBitmap(bitmap,360,660,true)

        return ImagePrintable.Builder(wideBitmap)
            .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
            .setNewLinesAfter(1)
            .build()
    }
}