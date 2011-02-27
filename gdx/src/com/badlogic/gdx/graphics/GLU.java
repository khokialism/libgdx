package com.badlogic.gdx.graphics;

/**
 * OpenGL utility class.
 * @author mzechner
 *
 */
public interface GLU {
	public void gluLookAt (GL10 gl, float eyeX, float eyeY, float eyeZ, float centerX, float centerY, float centerZ, float upX, float upY, float upZ);
	public void gluOrtho2D (GL10 gl, float left, float right, float bottom, float top);
	public void gluPerspective (GL10 gl, float fovy, float aspect, float zNear, float zFar);
	public boolean gluProject (float objX, float objY, float objZ, float[] model, int modelOffset, float[] project, int projectOffset, int[] view, int viewOffset, float[] win, int winOffset);
	public boolean gluUnProject (float winX, float winY, float winZ, float[] model, int modelOffset, float[] project, int projectOffset, int[] view, int viewOffset, float[] obj, int objOffset);
}
