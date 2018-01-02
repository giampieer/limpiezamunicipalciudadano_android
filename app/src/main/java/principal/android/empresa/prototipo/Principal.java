package principal.android.empresa.prototipo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import layout.Ajustes;
import layout.Ayuda;
import layout.Informacion;
import layout.ServiciosMunicipalidad;
import layout.anuncio;
import layout.iniciopersona;
import layout.listarcamiones;
import layout.listarhorario;
import layout.membresiacancelada;
import layout.peticion;

public class Principal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
inicio();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.ServiciosMunicipalidad) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            ServiciosMunicipalidad container1Fragment = new ServiciosMunicipalidad();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).addToBackStack(null).commit();        }
        if (id == R.id.Ayuda) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            Ayuda container1Fragment = new Ayuda();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).addToBackStack(null).commit();        }
        if (id == R.id.Informacion) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            Informacion container1Fragment = new Informacion();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).addToBackStack(null).commit();        }
        if (id == R.id.membresia) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            membresiacancelada container1Fragment = new membresiacancelada();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).addToBackStack(null).commit();        }
        if (id == R.id.Ajustes) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            Ajustes container1Fragment = new Ajustes();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).addToBackStack(null).commit();        }
        if (id == R.id.CERRARSESION) {

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Principal.this);
            dialogo1.setTitle("Importante");
            dialogo1.setMessage("¿Deseas cerrar sesion ?");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Cerrar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    cerrar_sesion();                }
            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {

                }
            });
            dialogo1.show();        }

        return super.onOptionsItemSelected(item);
    }
    public void inicio(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        iniciopersona container1Fragment = new iniciopersona();
        //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
        fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();
    }
    public void cerrar_sesion(){
        //limpiar los datos almacenados para inicar sesion
        System.exit(0);

    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.inicio1) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            iniciopersona container1Fragment = new iniciopersona ();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();
            // Handle the camera action
        } else if (id == R.id.camionescercanos1) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            listarcamiones container1Fragment = new listarcamiones();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();
            // Handle the camera action
        } else if (id == R.id.horario1) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            listarhorario container1Fragment = new listarhorario();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();

        } else if (id == R.id.peticion1) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            peticion container1Fragment = new peticion();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();
        }  else if (id == R.id.anuncios1) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            anuncio container1Fragment = new anuncio();
            //animacion adelantar R.anim.enter_from_right, R.anim.exit_to_left
            fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, container1Fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
