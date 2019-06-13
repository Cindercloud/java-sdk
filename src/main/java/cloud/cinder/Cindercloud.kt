package cloud.cinder

import cloud.cinder.ethereum.Ethereum

class Cindercloud {

    fun ethereum(): Ethereum {
        return Ethereum()
    }
}