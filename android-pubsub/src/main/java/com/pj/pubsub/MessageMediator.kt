package com.pj.pubsub

import com.pj.pubsub.data.Message

interface MessageMediator {
    fun register(receiver: Receiver)
    fun unregister(id: Int, key: String)

    fun watch(receiver: Receiver)
    fun unwatch(id: Int)

    fun publish(message: Message, publisherId: Int)
}