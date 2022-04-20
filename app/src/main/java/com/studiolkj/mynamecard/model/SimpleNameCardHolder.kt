package com.studiolkj.mynamecard.model

import android.content.Context
import com.mazenrashed.printooth.data.printable.ImagePrintable
import com.mazenrashed.printooth.data.printable.Printable
import com.mazenrashed.printooth.data.printable.TextPrintable
import com.mazenrashed.printooth.data.printer.DefaultPrinter
import com.studiolkj.mynamecard.common.Utils

class SimpleNameCardHolder: NameCardHolder() {

    override fun getNameCard(context: Context): ArrayList<Printable>{
        myNameCardDatas.add(getHeaderImage(context))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("  이길재   [Mobile Developer]", DefaultPrinter.ALIGNMENT_CENTER))
        myNameCardDatas.add(getString("      - Android & iOS        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("      - Kotlin & Swift & JAVA", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("H.P: 010-3445-2019", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("email: bl2019@naver.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("GitHub: github.com/lee-kil-jae", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("Blog: als2019.tistory.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getMyBlogQrCode())
        myNameCardDatas.add(getRandomMessage())
        myNameCardDatas.add(getMargin())

        return myNameCardDatas
    }

}