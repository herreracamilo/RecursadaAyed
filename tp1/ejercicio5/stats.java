package tp1.ejercicio5;

public class stats {
        private int maximo;
        private int minimo;
        private int promedio;
        

        public int getMaximo() {
            return maximo;
        }
        public void setMaximo(int maximo) {
            this.maximo = maximo;
        }
        public int getMinimo() {
            return minimo;
        }
        public void setMinimo(int minimo) {
            this.minimo = minimo;
        }
        public int getPromedio() {
            return promedio;
        }
        public void setPromedio(int promedio) {
            this.promedio = promedio;
        }

        @Override
        public String toString() {
            return "stats [maximo=" + maximo + ", minimo=" + minimo + ", promedio=" + promedio + "]";
        }

        
        
        
}
