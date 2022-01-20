package chat;

public class ListaMensagens
{
	private NoMsg inicio;
	private int qtdMsgs;

	static class NoMsg
	{
		Mensagem msg;
		NoMsg prox;

		NoMsg(Mensagem msg)
		{
			this.msg = msg;
			this.prox = null;
		}
	}

	public ListaMensagens()
	{
		inicio = null;
		qtdMsgs = 0;
	}

	public void adicionarMensagem(Mensagem mensagem)
	{
		NoMsg novo = new NoMsg(mensagem);

		if (inicio == null)
		{
			inicio = novo;
		}
		else
		{
			NoMsg anterior = null;
			NoMsg atual = inicio;

			while(atual != null)
			{
				anterior = atual;
				atual = atual.prox;
			}
			anterior.prox = novo;
		}
		qtdMsgs++;
	}

	public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta)
	{
		NoMsg noRespondido = inicio;
		for (int i = 0; i < indiceMensagemOriginal; i++)
		{
			noRespondido = noRespondido.prox;
		}
		
		NoMsg novo = new NoMsg(resposta);
		NoMsg atual = noRespondido;
		while (atual.prox != null)
		{
			atual = atual.prox;
		}
		atual.prox = novo;
		qtdMsgs++;

		noRespondido.msg.responder(novo.msg);
	}

	public Mensagem[] getMensagens()
	{
		if (inicio == null) return null;

		Mensagem[] mensagens = new Mensagem[qtdMsgs];
		NoMsg atual = inicio;

		for (int i = 0; i < qtdMsgs; i++)
		{
			mensagens[i] = atual.msg;
			atual = atual.prox;
		}
		return mensagens;
	}

	public String[] getMensagensString()
	{
		if (inicio == null) return null;

		String[] mensagens = new String[qtdMsgs];
		NoMsg atual = inicio;

		for (int i = 0; i < qtdMsgs; i++)
		{
			mensagens[i] = atual.msg.getRepresentacao();
			atual = atual.prox;
		}
		return mensagens;
	}

	public void like(int indiceMensagem)
	{
		if (indiceMensagem > qtdMsgs || qtdMsgs == 0) return;

		NoMsg atual = inicio;
		for (int i = 0; i < indiceMensagem; i++)
		{
			atual = atual.prox;
		}
		atual.msg.like();
	}
}