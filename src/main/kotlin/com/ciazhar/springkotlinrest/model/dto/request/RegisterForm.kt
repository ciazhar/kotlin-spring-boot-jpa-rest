package com.ciazhar.springkotlinrest.model.dto.request

import javax.validation.constraints.NotNull

/**
 * Created by ciazhar on 8/31/17.
 */

class RegisterForm(
        @field:NotNull
        var nama : String?=null,

        @field:NotNull
        var email : String?=null
)
