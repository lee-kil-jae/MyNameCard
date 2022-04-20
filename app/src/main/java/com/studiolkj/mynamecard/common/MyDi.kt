package com.studiolkj.mynamecard.common

import com.studiolkj.mynamecard.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


var viewModelPart = module {
    viewModel {
        MainViewModel()
    }
}

var myDiModule = listOf(
    viewModelPart
)
