package Pacote;

public class Conta {

	public int numConta;
	protected String tipo;
	private  String dono;
	private float saldo;
	private boolean status;
	
	public Conta() {

		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if(t =="cc") {
			this.setSaldo(this.getSaldo() + 50);
		}else {
			this.setSaldo(this.getSaldo() + 150);
		}
	}
public void fecharConta() {
		if(this.getSaldo()> 0) {
			System.out.println("Conta não pode ser fechada porque tem dinheiro");
		}else if(this.getSaldo() < 0){
			System.out.println("Conta não pode ser fechada porque tem uma dívida");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
		}
		
	}
public void depositar(float deposito) {
	if(this.isStatus() == true) {
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Depósito realizado com sucesso");
	}else {
		System.out.println("A conta está fechada,não é possível depositar");
	}
	
}
public void sacar(float saque) {
	if(this.isStatus() == true) {
		if(saque< this.getSaldo()) {
		this.setSaldo(this.getSaldo() - saque);
		System.out.println("Saque realizado com sucesso");
	}else {
		
		System.out.println("Não foi possível realizar o saque pois o saldo é insuficiente");
	}
	
		
	}else {
		System.out.println("A conta está fechada,não é possível sacar");
	}
}

public void pagarMensalidade() {
	if(this.isStatus() == true) {
	if(this.getTipo() == "cc") {
		this.setSaldo(this.getSaldo() - 12);
		System.out.println("Pagamento mensal realizado com sucesso!");
	}else {
		this.setSaldo(this.getSaldo() - 20);
		System.out.println("Pagamento mensal realizado com sucesso!");
	}
}else {
	System.out.println("Não foi possível realizar o pagamentos porque a conta está fechada");
}

}
public void estadoAtual() {
	System.out.println("Conta: "+ this.getNumConta());
	System.out.println("Dono: " + this.getDono());
	System.out.println("Tipo: "+ this.getTipo());
	System.out.println("Saldo: " + this.getSaldo());
	System.out.println("Status: "+ this.isStatus());
}

public int getNumConta() {
	return numConta;
}

public void setNumConta(int numConta) {
	this.numConta = numConta;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getDono() {
	return dono;
}

public void setDono(String dono) {
	this.dono = dono;
}

public float getSaldo() {
	return saldo;
}

public void setSaldo(float saldo) {
	this.saldo = saldo;
}

public boolean isStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}



}

