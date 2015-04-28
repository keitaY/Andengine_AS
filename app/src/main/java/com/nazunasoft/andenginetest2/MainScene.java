package com.nazunasoft.andenginetest2;
import java.io.IOException;
import java.util.ArrayList;
import org.andengine.audio.music.Music;
import org.andengine.audio.music.MusicFactory;
import org.andengine.audio.sound.Sound;
import org.andengine.audio.sound.SoundFactory;
import org.andengine.engine.handler.timer.ITimerCallback;
import org.andengine.engine.handler.timer.TimerHandler;
import org.andengine.entity.modifier.FadeInModifier;
import org.andengine.entity.modifier.FadeOutModifier;
import org.andengine.entity.modifier.MoveXModifier;
import org.andengine.entity.scene.IOnSceneTouchListener;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.entity.text.Text;
import org.andengine.entity.text.TextOptions;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.font.Font;
import org.andengine.opengl.texture.Texture;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.util.HorizontalAlign;
import org.andengine.util.color.Color;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.region.TextureRegion;
import android.app.ActionBar.LayoutParams;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.widget.LinearLayout;

public class MainScene extends KeyListenScene implements IOnSceneTouchListener {

    public MainScene(MultiSceneActivity baseActivity) {
        super(baseActivity);
        init();
    }
    public void init() {
        registerUpdateHandler(updateHandler);
        setOnSceneTouchListener(this);
    }
    // アップデートハンドラ。1秒間に60回呼び出される
    public TimerHandler updateHandler = new TimerHandler(1f / 60f, true,
            new ITimerCallback() {

                public void onTimePassed(TimerHandler pTimerHandler) {
                }
            }
     );

    @Override
    public void prepareSoundAndMusic() {//------------------------------------------------------------------------------------------------------------sound
        /*
        try{

        }catch(IOException e){
            e.printStackTrace();
        }
        */
    }
    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        return false;
    }

    public boolean onSceneTouchEvent(Scene pScene, TouchEvent pSceneTouchEvent) {
        // タッチの座標を取得
        float x = pSceneTouchEvent.getX();
        float y = pSceneTouchEvent.getY();
        return true;
    }


}