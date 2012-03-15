# net.blimster.gwt.threejs (a.k.a. three4g)

three4g is a GWT binding for [three.js](https://github.com/mrdoob/three.js/) by Mr.doob.

## Getting Started

three4g uses the Eclipse IDE for developing. It uses the XText plug-in to generate wrapper classes for the public three.js API.

### Download the project

Use a GIT team provider plug-in (e.g. EGit) to import the project **net.blimster.gwt.threejs** into your Eclipse workspace.

### Create a project

Create a new GWT project and add dependencies to the imported three4g project:

* In the Eclipse projects settings
* In your GWT module file (*.gwt.xml)

Example for GWT module file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module rename-to='[YOUR MODULE NAME]'>
  <inherits name='com.google.gwt.user.User'/>
  <inherits name='com.google.gwt.user.theme.standard.Standard'/>
  <inherits name='net.blimster.gwt.threejs'/>

  <source path='[YOUR SOURCE PATH]'/>
    
  <entry-point class='[YOUR ENTRY POINT CLASS]'/>
</module>
```

### Use three4g classes in your entry point class

```java
import net.blimster.gwt.threejs.cameras.Camera;
import net.blimster.gwt.threejs.cameras.PerspectiveCamera;
import net.blimster.gwt.threejs.core.Color;
import net.blimster.gwt.threejs.core.Geometry;
import net.blimster.gwt.threejs.core.Vector3;
import net.blimster.gwt.threejs.extras.geometries.CubeGeometry;
import net.blimster.gwt.threejs.materials.Material;
import net.blimster.gwt.threejs.materials.MeshBasicMaterial;
import net.blimster.gwt.threejs.objects.Mesh;
import net.blimster.gwt.threejs.renderers.WebGLRenderer;
import net.blimster.gwt.threejs.scenes.Scene;

import com.google.gwt.animation.client.AnimationScheduler;
import com.google.gwt.animation.client.AnimationScheduler.AnimationCallback;
import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Client implements EntryPoint, AnimationCallback
{

	private WebGLRenderer renderer;
	private Scene scene;
	private Camera camera;
	private Mesh mesh;

	@Override
	public void onModuleLoad()
	{
		Canvas canvas = Canvas.createIfSupported();

		this.renderer = WebGLRenderer.create(canvas);
		this.renderer.setSize(600, 400);
		this.renderer.setClearColor(Color.create(0x000000), 1.0f);

		RootPanel.get().add(canvas);

		Geometry geometry = CubeGeometry.create(100.0, 100.0, 100.0);
		Material material = MeshBasicMaterial.create(0xffffff, true);
		this.mesh = Mesh.create(geometry, material);

		this.scene = Scene.create();
		this.scene.add(this.mesh);

		this.camera = PerspectiveCamera.create(75.0f, 600.0 / 400.0, 1.0f, 1000.0f);
		this.camera.getPosition().setX(250.0);
		this.camera.getPosition().setZ(100.0);
		this.camera.setUp(Vector3.create(0.0, 0.0, 1.0));
		this.camera.lookAt(Vector3.create());

		AnimationScheduler.get().requestAnimationFrame(this);
	}

	@Override
	public void execute(double timestamp)
	{
		this.mesh.getRotation().setZ(this.mesh.getRotation().getZ() + 0.01);

		this.renderer.render(this.scene, this.camera);

		AnimationScheduler.get().requestAnimationFrame(this);
	}
}
```