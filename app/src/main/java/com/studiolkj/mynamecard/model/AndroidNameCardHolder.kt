package com.studiolkj.mynamecard.model

import android.content.Context
import com.mazenrashed.printooth.data.printable.Printable
import com.mazenrashed.printooth.data.printer.DefaultPrinter

class AndroidNameCardHolder: NameCardHolder() {

    override fun getNameCard(context: Context): ArrayList<Printable>{
        myNameCardDatas.add(getHeaderImage(context))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("이길재 [Android Developer]", DefaultPrinter.ALIGNMENT_CENTER))
        myNameCardDatas.add(getString("* GitHub: github.com/lee-kil-jae", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("* H.P: 010-3445-2019", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("* email: bl2019@naver.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("** 개발 언어 & 툴     ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Kotlin, JAVA", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Android Studio, Eclipse", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 개발 방법론        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Agile(Scrum, Kanban, Sprint)", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - UML(Usecase, sequence, ...)", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 개발 기타        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - secure coding, JNI, 암호화", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - MVVM, MVP, design pattern", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - reactive, npm, express", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - AAC, coroutine, koin, ROOM", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - retrofit, okhttp", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 테스트 자동화        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - JUNIT, espresso", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 형상 관리 툴        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - git, github, gitlab", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 협업 툴        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - JIRA, Confluence", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Balsamic, OVEN", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Zeplin, Sketch", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 기타        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - KIOSK, NFC, BLE", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Barcode, Qrcode", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("Blog: als2019.tistory.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getMyBlogQrCode())
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("MyApp: storyBook Plus", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getMyAppQrCode())
        myNameCardDatas.add(getRandomMessage())
        myNameCardDatas.add(getMargin())

        return myNameCardDatas
    }
}