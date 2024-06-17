public class Main {
    public static void main(String[] args) {
        NotificacionFactory factoryUrgente = new UrgenteNotificacionFactory();
        EmailNotificacion emailUrgente = factoryUrgente.crearEmailNotificacion();
        SMSNotificacion smsUrgente = factoryUrgente.crearSMSNotificacion();
        AppNotificacion appUrgente = factoryUrgente.crearAppNotificacion();

        NotificacionFactory factoryRegular = new RegularNotificacionFactory();
        EmailNotificacion emailRegular = factoryRegular.crearEmailNotificacion();
        SMSNotificacion smsRegular = factoryRegular.crearSMSNotificacion();
        AppNotificacion appRegular = factoryRegular.crearAppNotificacion();

        String urgenciaDeNotificacion = "Urgente";
        String claseDeNotificacion = "App";

        if (urgenciaDeNotificacion == "Urgente") {
            //System.out.println("Desea enviar la notificacion URGENTE por email, SMS o por la App?");
            if (claseDeNotificacion == "Email") {
                emailUrgente.enviarEmail();
            } else if (claseDeNotificacion == "SMS") {
                smsUrgente.enviarSMS();
            } else if (claseDeNotificacion == "App") {
                appUrgente.enviarApp();
            }
        } else if (urgenciaDeNotificacion == "Regular") {
            //System.out.println("Desea enviar la notificacion regular por email, SMS o por la App?");
            if (claseDeNotificacion == "Email") {
                emailRegular.enviarEmail();
            } else if (claseDeNotificacion == "SMS") {
                smsRegular.enviarSMS();
            } else if (claseDeNotificacion == "App") {
                appRegular.enviarApp();
            }
        }
    }
}