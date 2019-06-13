package cloud.cinder.ethereum

class EthereumAccount(val address: String) {

    fun getBalance() {
        throw NotImplementedError()
    }

    fun getNonce() {
        throw NotImplementedError()
    }

    fun getTokens() {
        throw NotImplementedError()
    }
}