package com.studiolkj.mynamecard.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.mazenrashed.printooth.ui.ScanningActivity
import com.studiolkj.mynamecard.R
import com.studiolkj.mynamecard.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    companion object {
        val TAG = "MainActivity"
        val CALLTYPE = "CALLTYPE"
        val CALLTYPE_PAIRING = 0
    }

    override val layoutResourceId: Int get() = R.layout.activity_main

    private var resultLauncher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewDataBinding.vmMain = getViewModel()
        viewDataBinding.lifecycleOwner = this

        viewDataBinding.vmMain?.onPairing?.observe(this, {
            pairing()
        })

        resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult(),
            ActivityResultCallback { result ->
                if(result.resultCode == RESULT_OK) {
                    Toast.makeText(this, "페어링이 완료 되었습니다.", Toast.LENGTH_SHORT).show()
                    viewDataBinding.vmMain?.checkPrint()
                }
            }
        )
    }

    override fun onResume() {
        super.onResume()
        viewDataBinding.vmMain?.checkPrint()
    }

    fun pairing() {
        val intent = Intent(applicationContext, ScanningActivity::class.java)
        intent.putExtra(CALLTYPE, CALLTYPE_PAIRING)
        resultLauncher!!.launch(intent)
    }
}