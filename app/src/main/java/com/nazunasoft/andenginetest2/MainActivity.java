package com.nazunasoft.andenginetest2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import org.andengine.audio.music.MusicFactory;
import org.andengine.audio.sound.SoundFactory;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;

public class MainActivity extends MultiSceneActivity {
    private int CAMERA_WIDTH = 480;
    private int CAMERA_HEIGHT = 800;
    static SharedPreferences sp ;
    public EngineOptions onCreateEngineOptions() {
        final Camera camera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
        EngineOptions eo = new EngineOptions(true,
                ScreenOrientation.PORTRAIT_FIXED, new RatioResolutionPolicy(
                CAMERA_WIDTH, CAMERA_HEIGHT), camera);
        eo.getAudioOptions().setNeedsSound(true);
        eo.getAudioOptions().setNeedsMusic(true);
        return eo;
    }

    @Override
    protected Scene onCreateScene() {

        // MainSceneをインスタンス化し、エンジンにセット
        SoundFactory.setAssetBasePath("mfx/");
        MusicFactory.setAssetBasePath("mfx/");
        MainScene mainScene = new MainScene(this);
        sp =  getSharedPreferences("myprefs", Context.MODE_PRIVATE);
        return mainScene;
    }

    @Override
    protected int getLayoutID() {
        // ActivityのレイアウトのIDを返す
        return R.layout.activity_main;
    }

    @Override
    protected int getRenderSurfaceViewID() {
        // SceneがセットされるViewのIDを返す
        return R.id.renderview;
    }

    @Override
    public void appendScene(KeyListenScene scene) {

    }

    @Override
    public void backToInitial() {

    }

    @Override
    public void refreshRunningScene(KeyListenScene scene) {
    }

    @Override
    public void onGameDestroyed(){
        System.exit(0);
    }

}