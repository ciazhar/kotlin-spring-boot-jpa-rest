package com.ciazhar.springkotlinrest.repository

import com.ciazhar.springkotlinrest.model.Costumer
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by ciazhar on 8/25/17.
 */

interface CostumerRepository : PagingAndSortingRepository<Costumer,Int>