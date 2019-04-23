package com.ballboycorp.tingting.pocha.dialog.room

import androidx.databinding.Bindable
import com.ballboycorp.tingting.BR
import com.ballboycorp.tingting.base.BaseObservableViewModel

/**
 * Created by musooff on 2019-04-23.
 */

class CreateRoomViewModel: BaseObservableViewModel() {

    var selectedGameId: Int = -1
    var selectedGiftId: Int = -1

    var canCreateRoom: Boolean = false
        @Bindable get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.canCreateRoom)
        }

    fun verifyCanCreateRoon() {
        canCreateRoom = selectedGameId > -1 && selectedGiftId > -1
    }
}