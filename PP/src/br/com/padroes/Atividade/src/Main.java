public class Main {
    public static void main(String[] args) {
        AppWithReactNative appReact = AppWithReactNative.getInstance();
        AppWithFlutter appWithFlutter = AppWithFlutter.getInstance();

        //AppWithReactNative appReactNovo = new AppWithReactNative();
        //AppWithFlutter appFlutterNovo = new AppWithFlutter();

        DesenvolverApp app1 = new DesenvolverApp(new modeloFlutterBuilder());
        app1.desenvolverAppFlutter();
        AppWithFlutter af1 = app1.getAplicativoFlutter().getApp();


        DesenvolverApp app2 = new DesenvolverApp(new modeloReactNativeBuilder());
        app2.desenvolverAppReact();
        AppWithReactNative arn1 = app2.getAplicativoReactNative().getApp();

        System.out.println(af1.toString());
        System.out.println(arn1.toString());
    }
}
