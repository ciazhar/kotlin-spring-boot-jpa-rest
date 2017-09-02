package com.ciazhar.springkotlinrest.service.impl

import com.ciazhar.authserver.config.string.ErrorMessage
import com.ciazhar.springkotlinrest.model.Costumer
import com.ciazhar.springkotlinrest.model.dto.request.RegisterForm
import com.ciazhar.springkotlinrest.model.dto.response.ResponseData
import com.ciazhar.springkotlinrest.repository.CostumerRepository
import com.ciazhar.springkotlinrest.service.CostumerService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CostumerServiceImpl (private val costumerRepository: CostumerRepository) : CostumerService {

    override fun register(registerForm: RegisterForm) : ResponseData<*>{
        try {
            costumerRepository.save(Costumer(
                    nama = registerForm.nama,
                    email = registerForm.email
            ))
        }catch (e:Exception){
            return ResponseData<Objects>(status = ErrorMessage.ERROR,message = e.message)
        }
        return ResponseData(registerForm)
    }

    override fun delete(id: Int): ResponseData<*> {
        try {
            costumerRepository.delete(id)
        }catch (e:Exception){
            return ResponseData<Objects>(status = ErrorMessage.ERROR,message = e.message)
        }
        return ResponseData(id)
    }

    override fun findOne(id: Int): ResponseData<*> {
        try {
            return ResponseData(costumerRepository.findOne(id))
        }catch (e:Exception){
            return ResponseData<Objects>(status = ErrorMessage.ERROR,message = e.message)
        }

    }

    override fun findAll(): ResponseData<*> {
        try {
            return ResponseData(costumerRepository.findAll())
        }catch (e:Exception){
            return ResponseData<Objects>(status = ErrorMessage.ERROR,message = e.message)
        }
    }

    override fun update(costumer: Costumer): ResponseData<*> {
        try {
            costumerRepository.save(costumer)
        }catch (e:Exception){
            return ResponseData<Objects>(status = ErrorMessage.ERROR,message = e.message)
        }
        return ResponseData(costumer)
    }
}