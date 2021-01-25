package com.teamonehundred.pixelboat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Represents the Options Menu Scene for when the player wants to select/edit the options before the race starts.
 *
 * @author William Walton
 * JavaDoc by Umer Fakher
 */
public class SceneOptionsMenu implements Scene {
    private final int scene_id = 2;

    private boolean is_fullscreen = false;

    private final Texture full_check_yes;
    private final Texture full_check_no;
    private final Texture back;
    private final Texture back_hovered;

    private final Sprite bg_sprite;
    private final Sprite full_sprite;
    private final Sprite full_check_sprite;
    private final Sprite left_sprite;
    private final Sprite right_sprite;
    private final Sprite back_sprite;
    private final Sprite accel_sprite;

    private final Viewport fill_viewport;
    private final OrthographicCamera fill_camera;

    /**
     * Main constructor for a SceneOptionsMenu.
     * <p>
     * Initialises a Scene textures for Options Menu and camera.
     * When options are hovered over they will change texture indicating what the user is about to select.
     *
     * @author William Walton
     */
    public SceneOptionsMenu() {
        fill_camera = new OrthographicCamera();
        fill_viewport = new FillViewport(1280, 720, fill_camera);
        fill_viewport.apply();
        fill_camera.position.set(fill_camera.viewportWidth / 2, fill_camera.viewportHeight / 2, 0);
        fill_viewport.update(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        Texture full = new Texture("options_menu_fullscreen.png");
        Texture accel = new Texture("options_menu_fullscreen.png");
        Texture left = new Texture("options_menu_fullscreen.png");
        Texture bg = new Texture("start_screen.png");
        Texture right = new Texture("options_menu_fullscreen.png");
        back = new Texture("options_menu_back.png");
        back_hovered = new Texture("options_menu_back_hovered.png");
        full_check_yes = new Texture("options_menu_checkbox_yes.png");
        full_check_no = new Texture("options_menu_checkbox_no.png");

        bg_sprite = new Sprite(bg);
        bg_sprite.setPosition(0, 0);
        bg_sprite.setSize(1280, 720);

        full_sprite = new Sprite(full);
        full_check_sprite = new Sprite(full_check_no);
        full_sprite.setSize(256.0f, 64.0f);
        full_sprite.setPosition((fill_camera.viewportWidth / 2) - (full_sprite.getWidth()), (Gdx.graphics.getHeight() / 2.0f) + (full_sprite.getHeight() * 1.5f));
        full_check_sprite.setSize(64.0f, 64.0f);
        full_check_sprite.setPosition((fill_camera.viewportWidth / 2) + (full_sprite.getWidth() / 2), (Gdx.graphics.getHeight() / 2.0f) + (full_sprite.getHeight() * 1.5f));

        accel_sprite = new Sprite(accel);
        accel_sprite.setSize(256.0f, 64.0f);
        accel_sprite.setPosition((fill_camera.viewportWidth / 2) - (full_sprite.getWidth()), (Gdx.graphics.getHeight() / 2.0f) + (full_sprite.getHeight() * .5f));

        left_sprite = new Sprite(left);
        left_sprite.setSize(256.0f, 64.0f);
        left_sprite.setPosition((fill_camera.viewportWidth / 2) - (full_sprite.getWidth()), (Gdx.graphics.getHeight() / 2.0f) - (full_sprite.getHeight() * .5f));

        right_sprite = new Sprite(right);
        right_sprite.setSize(256.0f, 64.0f);
        right_sprite.setPosition((fill_camera.viewportWidth / 2) - (full_sprite.getWidth()), (Gdx.graphics.getHeight() / 2.0f) - (full_sprite.getHeight() * 1.5f));

        back_sprite = new Sprite(back);
        back_sprite.setSize(256.0f, 64.0f);
        back_sprite.setPosition((fill_camera.viewportWidth / 2) - (full_sprite.getWidth()), 70);
    }

    /**
     * Draw function for SceneOptionsMenu.
     * <p>
     * Draws Options Menu for the PixelBoat game.
     *
     * @param batch SpriteBatch used for drawing to screen.
     * @author William Walton
     */
    public void draw(SpriteBatch batch) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.setProjectionMatrix(fill_camera.combined);
        batch.begin();
        bg_sprite.draw(batch);
        full_sprite.draw(batch);
        accel_sprite.draw(batch);
        left_sprite.draw(batch);
        right_sprite.draw(batch);
        back_sprite.draw(batch);
        full_check_sprite.draw(batch);
        batch.end();
    }

    /**
     * Update function for SceneOptionsMenu. Ends SceneOptionsMenu based on user input otherwise stays in scene.
     * <p>
     * Returns an specified integer when you want to exit the screen else return scene_id if you want to stay in scene.
     * In this case left clicking with the mouse on  the back button will stop the Options Menu Scene
     * and continue with the Main Menu Scene.
     *
     * @return returns an integer which is the scene_id of which screen is next (either this screen still or another)
     * @author William Walton
     */
    public int update() {
        Vector3 mouse_pos = fill_camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));

        if (back_sprite.getBoundingRectangle().contains(mouse_pos.x, mouse_pos.y)) {
            back_sprite.setTexture(back_hovered);
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                return 0;
            }
        } else
            back_sprite.setTexture(back);

        // todo add single click detection to stop this changing every frame
        if (full_check_sprite.getBoundingRectangle().contains(mouse_pos.x, mouse_pos.y)) {
            //full_check_sprite.setTexture(full_check_);
            if (Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
                full_check_sprite.setTexture(is_fullscreen ? full_check_no : full_check_yes);
                is_fullscreen = !is_fullscreen;
            }
        }

        return scene_id;
    }

    /**
     * Temp resize method if needed for camera extension.
     *
     * @param width  Integer width to be resized to
     * @param height Integer height to be resized to
     * @author William Walton
     */
    public void resize(int width, int height) {
        fill_viewport.update(width, height);
        fill_camera.position.set(fill_camera.viewportWidth / 2, fill_camera.viewportHeight / 2, 0);
    }
}
