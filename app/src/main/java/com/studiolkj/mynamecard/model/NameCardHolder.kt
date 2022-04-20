package com.studiolkj.mynamecard.model

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.mazenrashed.printooth.data.printable.ImagePrintable
import com.mazenrashed.printooth.data.printable.Printable
import com.mazenrashed.printooth.data.printable.TextPrintable
import com.mazenrashed.printooth.data.printer.DefaultPrinter
import com.studiolkj.mynamecard.R
import com.studiolkj.mynamecard.common.Utils
import com.studiolkj.mynamecard.viewmodel.MainViewModel

enum class MyNameCardType {
    SIMPLE, SIMPLE_WIDE, DETAIL, FOCUS_ANDROID, FOCUS_IOS
}

open class NameCardHolder {

    companion object {
        val TAG = "NameCardHolder"
        val MY_BLOG_URL = "https://als2019.tistory.com"
        val MY_APP_URL = "https://play.google.com/store/apps/details?id=com.studiolkj.newsmagazine"

        fun getNameCard(context: Context, type: MyNameCardType): ArrayList<Printable> {
            val nameCard: NameCardHolder = when(type){
                MyNameCardType.SIMPLE -> SimpleNameCardHolder()
                MyNameCardType.SIMPLE_WIDE -> WideNameCardHolder()
                MyNameCardType.DETAIL -> DetailNameCardHolder()
                MyNameCardType.FOCUS_ANDROID -> AndroidNameCardHolder()
                MyNameCardType.FOCUS_IOS -> IosNameCardHolder()
            }
            return nameCard.getNameCard(context)
        }
    }

    protected val myNameCardDatas = ArrayList<Printable>()

    open fun getNameCard(context: Context): ArrayList<Printable> {
        return myNameCardDatas
    }

    protected fun clear(){
        myNameCardDatas.clear()
    }

    protected fun getHeaderImage(context: Context): Printable {
        val bitmap  = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_namecard_header)
        val headerBitmap = Bitmap.createScaledBitmap(bitmap,320,80,true)

        return ImagePrintable.Builder(headerBitmap)
                .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
                .setNewLinesAfter(1)
                .build()
    }

//    protected fun getDivider(): Printable {
//        return getString("====================================", DefaultPrinter.ALIGNMENT_LEFT)
//    }

    protected fun getDivider(): Printable {
        return TextPrintable.Builder()
            .setText("--------------------------------")
            .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
            .setEmphasizedMode(DefaultPrinter.EMPHASIZED_MODE_NORMAL)
            .setUnderlined(DefaultPrinter.UNDERLINED_MODE_OFF)
            .setNewLinesAfter(1)
            .build()
    }

    protected fun getMyBlogQrCode(): Printable {
        return ImagePrintable.Builder(Utils.resizeBitmap(Utils.generateQrCode(MY_BLOG_URL)))
                .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
                .setNewLinesAfter(1)
                .build()
    }

    protected fun getMyAppQrCode(): Printable {
        return ImagePrintable.Builder(Utils.resizeBitmap(Utils.generateQrCode(MY_APP_URL)))
            .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
            .setNewLinesAfter(1)
            .build()
    }

    protected fun getRandomMessage(): Printable {
        return ImagePrintable.Builder(Utils.getTextBitmap(Utils.getRandomString(), 24))
            .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
            .setNewLinesAfter(1)
            .build()
    }

    protected fun getMargin(): Printable {
        return ImagePrintable.Builder(Utils.getTextBitmap(" ", 22))
            .setAlignment(DefaultPrinter.ALIGNMENT_CENTER)
            .build()
    }

    protected fun getString(str: String, alignment: Byte): Printable {
        return ImagePrintable.Builder(Utils.getTextBitmap(str, 24))
                .setAlignment(alignment)
                .setNewLinesAfter(1)
                .build()
    }
}