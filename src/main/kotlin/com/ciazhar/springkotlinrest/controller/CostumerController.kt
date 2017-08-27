package com.ciazhar.springkotlinrest.controller

import com.ciazhar.springkotlinrest.model.Costumer
import com.ciazhar.springkotlinrest.repository.CostumerRepository
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


/**
 * Created by ciazhar on 8/25/17.
 */

@RestController
@RequestMapping("/costumer")
class CostumerController(val repository: CostumerRepository){

    @RequestMapping("/all")
    fun findAll() = repository.findAll()

    @RequestMapping("/save")
    fun save(@RequestBody @Valid costumer : Costumer)= repository.save(costumer)

    @RequestMapping("/delete")
    fun delete(@RequestParam id : Int) = repository.delete(id)

    @RequestMapping("/single")
    fun string(@RequestParam id : Int) = repository.findOne(id)

}