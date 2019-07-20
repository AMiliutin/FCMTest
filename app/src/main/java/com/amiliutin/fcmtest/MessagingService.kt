package com.amiliutin.fcmtest

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService: FirebaseMessagingService() {

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        // Check if message contains a data payload.
        remoteMessage?.data?.isNotEmpty()?.let {
            Log.d("MessageService", "Message data payload: " + remoteMessage.data)
        }
        super.onMessageReceived(remoteMessage)
    }
    override fun onNewToken(p0: String?) {
        Log.d("TOKEN", "token $p0")
        super.onNewToken(p0)
    }

}