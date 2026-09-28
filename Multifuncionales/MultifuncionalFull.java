public class MultifuncionaFull implements Multifuncional { 

    @Override 
    public void Imprimir() { 
        System.out.println("Yo imprimo");
    }

    @Override 
    public void copiar() { 
        System.out.println("Yo copio");
    }

    @Override 
    public void escanear() { 
        System.out.println("Yo escaneo");
    }

    @Override 
    public void enviarRecibirFax() { 
        System.out.println("Yo envio y recibo FAX");
    }
}    