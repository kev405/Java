package ComienzoHerencia;

public class animal {

        private String nombre;
        private String alimentacion;
        private int edad;

        //Constructor

        public animal(String nombre, String alimentacion, int edad){
            this.nombre = nombre;
            this.alimentacion = alimentacion;
            this.edad = edad;
        }

        //setters

        public void setNombre(String nombre) {
            this.nombre = nombre;
        };
        public void setAlimentacion(String alimentacion) {
            this.alimentacion = alimentacion;
        };
        public void setEdad(int edad) {
            this.edad = edad;
        };

        //getters

        public String getAlimentacion() {
            return alimentacion;
        }
        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
}
