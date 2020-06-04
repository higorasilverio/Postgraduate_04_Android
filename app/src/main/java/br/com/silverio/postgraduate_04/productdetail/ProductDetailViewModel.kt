package br.com.silverio.postgraduate_04.productdetail

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.silverio.postgraduate_04.persistence.Product
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

private const val TAG = "ProductDetailViewModel"

class ProductDetailViewModel(private val code: String): ViewModel() {

    private lateinit var _products: MutableLiveData<List<Product>>
    val products: LiveData<List<Product>>
        get() = _products

    init {
        getProduct()
    }

    private fun getProduct() {

    }

    override fun onCleared() {
        Log.i(TAG, "onCleared")
        super.onCleared()
    }

}