package com.example.servicelocator

object ServiceLocator {

    val cache: Cache by lazy { Cache() }

    fun serviceLocatorPutNewInstance(instance: Any) = cache.put(instance)

    inline fun <reified T> getServiceInstance() = cache.get(T::class.java)

    inline fun <reified T> removeServiceInstance() = cache.remove(T::class.java)

    fun clearCache() = cache.clear()

}
