## Comunicacion entre Hilos

**1) public void wait()**

Hace que el hilo actual espere hasta que otro hilo invoque el aviso 

**2) public void notify()**

Despierta un único subproceso que está esperando en el monitor de este objeto.

**3) public void notifyAll()**

Despierta todos los hilos que llamaron a wait () en el mismo objeto.

Estos métodos se han implementado como métodos **final** en Object, por lo que están disponibles en todas las clases. Los tres métodos solo se pueden llamar desde un contexto sincronizado (***sincronized***).