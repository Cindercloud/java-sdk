package cloud.cinder.ethereum

class Ethereum {

    fun account(address: String): EthereumAccount {
        return EthereumAccount(address)
    }

    fun block(): EthereumBlock {
        return EthereumBlock()
    }

    fun contract(address: String): EthereumContract {
        return EthereumContract(address)
    }

    fun contract(): EthereumContracts {
        return EthereumContracts()
    }

    fun ens(): EthereumENS {
        return EthereumENS()
    }

    fun erc20(tokenAddress: String): EthereumERC20 {
        return EthereumERC20(tokenAddress)
    }

    fun token(tokenAddress: String): EthereumToken {
        return EthereumToken(tokenAddress)
    }

    fun transaction(): EthereumTransaction {
        return EthereumTransaction()
    }
}