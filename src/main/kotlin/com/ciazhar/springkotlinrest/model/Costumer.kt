package com.ciazhar.springkotlinrest.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by ciazhar on 8/25/17.
 */

@Entity
class Costumer (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int=0,

        var nama:String="",

        var email:String=""
)