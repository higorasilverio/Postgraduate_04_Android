package br.com.silverio.postgraduate_04.product

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.silverio.postgraduate_04.persistence.Product

private const val TAG = "ProductListViewModel"

class ProductListViewModel : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products
    init {
        getProducts()
    }
    private fun getProducts() {

    }
    fun refreshProducts() {
        _products.value = null
        getProducts()
    }

    override fun onCleared() {
        Log.i(TAG, "onCleared")
        super.onCleared()
    }
}