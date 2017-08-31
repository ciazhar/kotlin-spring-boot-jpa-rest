package com.ciazhar.springkotlinrest.model

import org.hibernate.validator.constraints.Email
import javax.persistence.*
import javax.validation.constraints.NotNull

/**
 * Created by ciazhar on 8/25/17.
 */

@Entity
data class Costumer (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Int?=null,

        @field:NotNull
        var nama:String?=null,

        @field:NotNull
        @field:Email
        @field:Column(unique = true)
        var email:String?=null
)
