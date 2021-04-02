package com.example.sample

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
class SampleUser : Serializable{
    companion object {
        private const val serialVersionUID = 20180617104400L
    }

    @PrimaryKey
    @NonNull
    private var id = 0
    private var firstName: String? = null
    private var lastName: String? = null
    private var aspID: String? = null
    private var intMetricMonthDefault:Int = 2

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getFirstName(): String? {
        return firstName
    }

    fun setFirstName(firstName: String?) {
        this.firstName = firstName
    }

    fun getLastName(): String? {
        return lastName
    }

    fun setLastName(lastName: String?) {
        this.lastName = lastName
    }

    fun getAspID(): String? {
        return aspID
    }

    fun setAspID(aspID: String?) {
        this.aspID = aspID
    }

    fun getIntMetricMonthDefault():Int{
        return intMetricMonthDefault
    }

    fun setIntMetricMonthDefault(setting: Int){
        this.intMetricMonthDefault = setting
    }
}