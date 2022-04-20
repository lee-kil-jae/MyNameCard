package com.studiolkj.mynamecard.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import com.mazenrashed.printooth.Printooth
import com.studiolkj.mynamecard.common.NotNullMutableLiveData
import com.studiolkj.mynamecard.R
import com.studiolkj.mynamecard.model.MyNameCardType
import com.studiolkj.mynamecard.model.NameCardHolder

class MainViewModel: BaseViewModel() {

    companion object {
        val TAG = "MainViewModel"
    }

    val onPairing: MutableLiveData<Boolean> = MutableLiveData()
    var printerState: NotNullMutableLiveData<Int> = NotNullMutableLiveData(R.string.checking)

    init {
        checkPrint()
    }

    fun checkPrint(){
        if (Printooth.hasPairedPrinter()) {
            printerState.postValue(R.string.connected)
        } else {
            printerState.postValue(R.string.not_connected)
        }
    }

    fun onPairing(view: View) {
        onPairing.postValue(true)

    }

    fun onPrintNameCard(view: View, type: MyNameCardType) {
        Printooth.printer().print(NameCardHolder.getNameCard(view.context, type))
    }

}