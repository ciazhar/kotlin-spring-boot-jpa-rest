package com.ciazhar.springkotlinrest.service.impl

import com.ciazhar.springkotlinrest.model.Costumer
import com.ciazhar.springkotlinrest.model.dto.request.RegisterForm
import com.ciazhar.springkotlinrest.model.dto.response.ResponseData
import com.ciazhar.springkotlinrest.repository.CostumerRepository
import com.ciazhar.springkotlinrest.service.CostumerService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CostumerServiceImpl (val costumerRepository: CostumerRepository) : CostumerService {

    override fun register(registerForm: RegisterForm) : ResponseData<*>{
        try {
            costumerRepository.save(Costumer(
                    nama = registerForm.nama,
                    email = registerForm.email
            ))
        }catch (e:Exception){
            return ResponseData<Objects>(status = "Register Failed",message = e.message)
        }
        return ResponseData(registerForm)
    }

    override fun delete(id: Int): ResponseData<*> {
        try {
            costumerRepository.delete(id)
        }catch (e:Exception){
            return ResponseData<Objects>(status = "Delete Failed",message = e.message)
        }
        return ResponseData(id)
    }


    override fun update(costumer: Costumer): ResponseData<*> {
        try {
            costumerRepository.save(costumer)
        }catch (e:Exception){
            return ResponseData<Objects>(status = "Update Failed",message = e.message)
        }
        return ResponseData(costumer)
    }
}