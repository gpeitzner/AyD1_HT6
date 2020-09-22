package Proceso;

import Interfaces.ObtenerCarrera;
import Objetos.Carrera;

import static org.mockito.Mockito.when;

import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AsignarHorarioTest {

    @InjectMocks
    AsignarHorario asignarHorario = new AsignarHorario();

    @Mock
    ObtenerCarrera obtener0c;

    @Before
    public void init() {
        when(obtener0c.obtener(1, "Sistemas")).thenReturn(new Carrera(1, "Sistemas"));
    }

    @Test
    public void probarObtenerCarrera(){
        Assert.assertNotNull(asignarHorario.obtenerCarrera(1, "Sistemas"));
        Assert.assertTrue(asignarHorario.obtenerCarrera(1, "Sistemas") instanceof Carrera);
    }

    @Test
    public void probarObtenerCarreraSistemas() {
        Assert.assertEquals(new Carrera(1, "Sistemas").getCodigo(), asignarHorario.obtenerCarrera(1, "Sistemas").getCodigo());
        Assert.assertEquals(new Carrera(1, "Sistemas").getDescripcion(), asignarHorario.obtenerCarrera(1, "Sistemas").getDescripcion());
    }

}