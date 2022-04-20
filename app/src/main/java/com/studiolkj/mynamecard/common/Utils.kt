package com.studiolkj.mynamecard.common

import android.graphics.*
import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.common.BitMatrix
import com.journeyapps.barcodescanner.BarcodeEncoder

object Utils {
    fun generateQrCode(code : String) : Bitmap {
        val multiFormatWriter = MultiFormatWriter()
        val bitMatrix = multiFormatWriter.encode(code, BarcodeFormat.QR_CODE, 2048, 2048)
        val barcodeEncoder = BarcodeEncoder()
        return barcodeEncoder.createBitmap(bitMatrix)
    }

    fun generateBarCode(code : String) : Bitmap {
        val multiFormatWriter = MultiFormatWriter()
        val bitMatrix = multiFormatWriter.encode(code, BarcodeFormat.CODE_128, 2048, 640)
        val barcodeEncoder = BarcodeEncoder()
        return barcodeEncoder.createBitmap(bitMatrix)
    }

    fun getRandomString() : String {
        val stringArray = arrayListOf<String>(
            "꽝 다음 기회에...",
            "아쉽게도 꽝 다음에...",
            "아슬아슬 꽝 다음에...",
            "3등 당첨! (명함 한장 더!)",
            "아까비! 꽝 다음에...",
            "꽝! 쫌만 더 힘내요...",
            "2등 당첨!! (명함 두장 더!)",
            "꽝! 완전 빗나감...",
            "당첨 같은 꽝 다음에...",
            "1등 당첨!!! (명함 세장 더!)")

        return "행운 당첨: " + stringArray[kotlin.random.Random.nextInt(0, stringArray.size-1)]
    }

    fun getTextBitmap(message : String, fontSize : Int) : Bitmap {
        val textBitmap = Bitmap.createBitmap(
            350,
            50,
            Bitmap.Config.ARGB_8888
        )
        textBitmap.eraseColor(Color.WHITE)
        val canvas = Canvas(textBitmap)

        val textPaint = Paint()
        textPaint.textSize = fontSize.toFloat()
//        textPaint.setAntiAlias(true)
        textPaint.setColor(Color.BLACK)
        val bounds = Rect()
        textPaint.getTextBounds(message, 0, message.length, bounds)
        // 중앙 정렬
//        val x = (330 - bounds.right)/2
//        canvas.drawText(message, x.toFloat(), Math.abs(bounds.top - bounds.bottom).toFloat(), textPaint)
        canvas.drawText(message, 0.toFloat(), Math.abs(bounds.top - bounds.bottom).toFloat(), textPaint)
        return textBitmap
    }

    fun resizeBitmap(bitmap : Bitmap) : Bitmap{
        val options = BitmapFactory.Options()
        options.inSampleSize = 4

        var width = 320
        var height = 120
        if(bitmap.width == bitmap.height) {
            width = 240
            height = 240
        }

        return Bitmap.createScaledBitmap(
            bitmap,
            width,
            height,
            true
        )
    }
}