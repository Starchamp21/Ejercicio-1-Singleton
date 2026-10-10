public class Main {
    public static void main(String[] args) {
        // Creo el botón antiguo.
        LegacyButton legacyButton = new LegacyButton();

        // Creo el adaptador.
        Button adapter = new LegacyButtonAdapter(legacyButton);

        // Creo la pantalla.
        Screen screen = new Screen();

        // Muestro el botón y simulo el clic
        screen.displayButton(adapter);
    }
}

/* Pregunta que debes ser capaz de responder
¿Por qué puede Screen trabajar con LegacyButton aunque LegacyButton no implemente la interfaz
Button?
Screen puede trabajar con LegacyButton de forma indirecta gracias al patrón Adapter. La clase LegacyButtonAdapter implementa la interfaz Button
y convierte la llamada onClick() en una llamada al método press() de LegacyButton. Así, Screen depende únicamente de la interfaz Button, sin conocer ni utilizar
directamente la clase antigua. */