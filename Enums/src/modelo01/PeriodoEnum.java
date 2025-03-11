package modelo01;

public enum PeriodoEnum {

        MANHA("Manhã"), 
        TARDE("Tarde"),
        NOITE("Noite");

        private String periodo;

        PeriodoEnum(String periodo){
                this.periodo = periodo;
        }

        public String getPeriodo(){
                return this.periodo;
        }


}