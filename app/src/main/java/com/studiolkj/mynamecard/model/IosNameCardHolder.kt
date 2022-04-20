package com.studiolkj.mynamecard.model

import android.content.Context
import com.mazenrashed.printooth.data.printable.Printable
import com.mazenrashed.printooth.data.printer.DefaultPrinter

class IosNameCardHolder: NameCardHolder() {

    override fun getNameCard(context: Context): ArrayList<Printable>{
        myNameCardDatas.add(getHeaderImage(context))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("  이길재 [iOS Developer]", DefaultPrinter.ALIGNMENT_CENTER))
        myNameCardDatas.add(getString("* GitHub: github.com/lee-kil-jae", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("* H.P: 010-3445-2019", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("* email: bl2019@naver.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("** 개발 언어 & 툴     ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Swift & XCode", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 개발 방법론        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Agile(Scrum, Kanban, Sprint)", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - UML(Usecase, sequence, class)", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 개발 기타        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - reactive, secure coding", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - MVVM, MVP, design pattern", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Alamofire, Kingfisher", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - RxSwift, RxCocoa", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 형상 관리 툴        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - git, github, gitlab", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("** 협업 툴        ", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - JIRA, Confluence", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Balsamic, OVEN", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getString("  - Zeplin, Sketch", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getDivider())
        myNameCardDatas.add(getString("Blog: als2019.tistory.com", DefaultPrinter.ALIGNMENT_LEFT))
        myNameCardDatas.add(getMyBlogQrCode())
        myNameCardDatas.add(getRandomMessage())
        myNameCardDatas.add(getMargin())

        return myNameCardDatas
    }
}