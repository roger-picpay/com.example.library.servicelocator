package com.example.servicelocator

class Cache {
    private val instances by lazy { mutableSetOf<Any>() }

    fun <T> remove(clazz: Class<T>) {
        val instance = instances.filterIsInstance(clazz).firstOrNull()
        instance ?: throw RuntimeException("Class not found")
        instances.remove(clazz)
    }

    fun clear() {
        instances.clear()
    }

    fun put(factory: Any) {
        instances.add(factory)
    }

    fun <T> get(clazz: Class<T>): T {
        val instance = instances.filterIsInstance(clazz).firstOrNull()
        return instance ?: throw RuntimeException("Class not found")
    }

}
