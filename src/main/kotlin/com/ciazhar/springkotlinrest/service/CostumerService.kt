package com.ciazhar.springkotlinrest.service

import com.ciazhar.springkotlinrest.model.Costumer
import com.ciazhar.springkotlinrest.model.dto.request.RegisterForm
import com.ciazhar.springkotlinrest.model.dto.response.ResponseData

/**
 * Created by ciazhar on 8/31/17.
 */

interface CostumerService {

    fun register(registerForm: RegisterForm) : ResponseData<*>

    fun delete(id: Int) : ResponseData<*>

    fun update(costumer: Costumer) : ResponseData<*>
}