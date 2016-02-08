package com.proyecto.converter;
import com.proyecto.model.Pais;
import com.proyecto.service.PaisServiceImpl;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;
/**
 *
 * @author ricardotoledo
 */
@FacesConverter(value="paisConverter")
public class PaisConverter implements Converter {
    @Inject private PaisServiceImpl pService;
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return pService.findById(Integer.parseInt(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Pais  pais = (Pais) value;
        return String.valueOf(pais.getId());
        
    }
}
