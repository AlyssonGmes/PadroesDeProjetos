package br.com.padroes.atividadeextra;

public class DesenvolverApp {

    ReactNativeAppBuilder aplicativoReactNative;
    FlutterAppBuilder aplicativoFlutter;

    public DesenvolverApp(FlutterAppBuilder app) {
        this.aplicativoFlutter = app;
    }

    public DesenvolverApp(ReactNativeAppBuilder app) {
        this.aplicativoReactNative = app;
    }

    public void desenvolverAppFlutter() {
        aplicativoFlutter.buildAnoDeEstreia();
        aplicativoFlutter.buildVersaoAtual();
        aplicativoFlutter.buildSistemaOperacional();
        aplicativoFlutter.buildLinguagemBase();
    }

    public void desenvolverAppReact() {
        aplicativoReactNative.buildAnoDeEstreia();
        aplicativoReactNative.buildVersaoAtual();
        aplicativoReactNative.buildSistemaOperacional();
        aplicativoReactNative.buildLinguagemBase();
    }

    public ReactNativeAppBuilder getAplicativoReactNative() {
        return aplicativoReactNative;
    }

    public FlutterAppBuilder getAplicativoFlutter() {
        return aplicativoFlutter;
    }
}
