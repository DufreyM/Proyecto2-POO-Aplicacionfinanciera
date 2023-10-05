//Fecha de creación: 05 de septiembre de 2023
//Fecha de última modificación: 05 de octubre de 2023

public class Presupuesto {
    private int presupuesto;
    private int necesidades_basicas;
    private int deudas_pagos;
    private int actividades_recreativas;
    private int ahorro;

    public Presupuesto(){
        presupuesto = 0;
        necesidades_basicas = 0;
        deudas_pagos = 0;
        actividades_recreativas = 0;
        ahorro = 0;
    }

    public Presupuesto(int presupuesto, int necesidades_basicas, int deudas_pagos, int actividades_recreativas,
            int ahorro) {
        this.presupuesto = presupuesto;
        this.necesidades_basicas = necesidades_basicas;
        this.deudas_pagos = deudas_pagos;
        this.actividades_recreativas = actividades_recreativas;
        this.ahorro = ahorro;
    }
    public int getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    public int getNecesidades_basicas() {
        return necesidades_basicas;
    }
    public void setNecesidades_basicas(int necesidades_basicas) {
        this.necesidades_basicas = necesidades_basicas;
    }
    public int getDeudas_pagos() {
        return deudas_pagos;
    }
    public void setDeudas_pagos(int deudas_pagos) {
        this.deudas_pagos = deudas_pagos;
    }
    public int getActividades_recreativas() {
        return actividades_recreativas;
    }
    public void setActividades_recreativas(int actividades_recreativas) {
        this.actividades_recreativas = actividades_recreativas;
    }
    public int getAhorro() {
        return ahorro;
    }
    public void setAhorro(int ahorro) {
        this.ahorro = ahorro;
    }

    /**
     * @return
     */
    public double CalculosNecesidadesBasicas(){
        int resultados_presupuesto1 = presupuesto - necesidades_basicas;
        return resultados_presupuesto1;
    }

    public double CalculosDeudasPagos(){
        int resultados_presupuesto2 = presupuesto - necesidades_basicas - deudas_pagos;
        return resultados_presupuesto2;
    }

    public double CalculosActividadesRecreativas(){
        int resultados_presupuesto3 = presupuesto - necesidades_basicas - deudas_pagos - actividades_recreativas;
        return resultados_presupuesto3;
    }

    public double CalculosAhorro(){
        int resultados_presupuesto4 = presupuesto - necesidades_basicas - deudas_pagos - actividades_recreativas - ahorro;
        return resultados_presupuesto4;
    }

}
