package com.denzcoskun.imageslider.models

import android.graphics.Bitmap
import com.denzcoskun.imageslider.constants.ScaleTypes

/**
 * Created by Deniz Coşkun on 6/23/2020.
 * denzcoskun@hotmail.com
 * İstanbul
 */
class SlideModel {

    var imageUrl: String? = null
    var resourceId: Int? = 0
    var bitmap: Bitmap? = null
    var title: String? = null
    var scaleType: ScaleTypes? = null

    constructor(imageUrl: String?, title: String? = null, scaleType: ScaleTypes?  = null) {
        this.imageUrl = imageUrl
        this.title = title
        this.scaleType = scaleType
    }

    constructor(resourceId: Int?, title: String?  = null, scaleType: ScaleTypes?  = null) {
        this.resourceId = resourceId
        this.title = title
        this.scaleType = scaleType
    }

    constructor(bitmap: Bitmap?, title: String? = null, scaleType: ScaleTypes? = null) {
        this.bitmap = bitmap
        this.title = title
        this.scaleType = scaleType
    }
    constructor(imageUrl: String?, scaleType: ScaleTypes?) {
        this.imageUrl = imageUrl
        this.scaleType = scaleType
    }

    constructor(resourceId: Int?, scaleType: ScaleTypes?) {
        this.resourceId = resourceId
        this.scaleType = scaleType
    }

    constructor(bitmap: Bitmap?, scaleType: ScaleTypes? = null) {
        this.bitmap = bitmap
        this.scaleType = scaleType
    }
}