package com.example.fragmentsexample.bundlePackage

import android.os.Parcel
import android.os.Parcelable

class CustomObject(var name: String?, var number: Int): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(number)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CustomObject> {
        override fun createFromParcel(parcel: Parcel): CustomObject {
            return CustomObject(parcel)
        }

        override fun newArray(size: Int): Array<CustomObject?> {
            return arrayOfNulls(size)
        }
    }
}