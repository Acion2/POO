package threads;

public class Main {

	public static void main(String[] args) {
		TarefaPesadaPi tarefa = new TarefaPesadaPi();
		// tarefa.run();

		Thread t1 = new Thread(tarefa);
		t1.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("Ola!");
		}

		while (t1.isAlive()) {
			System.out.println("Aguardando o fim da thread...");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Isso so pode ser feito depois do fim da Thread!");
	}

	public synchronized void runAlone() {
		System.out.println("I cannot run in multiple Threads!");
	}

}
