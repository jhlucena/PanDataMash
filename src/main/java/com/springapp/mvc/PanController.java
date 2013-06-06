package com.springapp.mvc;

import com.model.ComercioPan;
import com.model.FormBean;
import com.model.ResponseData;
import com.services.OBJEstablishment;
import com.services.WsEstablishments;
import com.services.WsEstablishmentsSoap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PanController {

    private String FORM_VIEW = "query";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String createForm(ModelMap model) {
        //Add dropbox items
        String statuses[] = {"ACTIVO", "INACTIVO"};
        String municipalities[] = {"Adjuntas", "Aguada", "Aguadilla", "Aguas Buenas", "Aibonito", "Añasco", "Arecibo",
                "Arroyo", "Barceloneta", "Barranquitas", "Bayamón", "Cabo Rojo", "Caguas", "Camuy",
                "Canóvanas", "Carolina", "Cataño", "Cayey", "Ceiba", "Ciales", "Cidra", "Coamo",
                "Comerío", "Corozal", "Culebra", "Dorado", "Fajardo", "Florida", "Guánica", "Guayama",
                "Guayanilla", "Guaynabo", "Gurabo", "Hatillo", "Hormigueros", "Humacao", "Isabela",
                "Jayuya", "Juana Díaz", "Juncos", "Lajas", "Lares", "Las Marías", "Las Piedras",
                "Loíza", "Luquillo", "Manatí", "Maricao", "Maunabo", "Mayagüez", "Moca", "Morovis",
                "Naguabo", "Naranjito", "Orocovis", "Patillas", "Peñuelas", "Ponce", "Quebradillas",
                "Rincón", "Río Grande", "Sabana Grande", "Salinas", "San Germán", "San Juan", "San Lorenzo",
                "San Sebastián", "Santa Isabel", "Toa Alta", "Toa Baja", "Trujillo Alto", "Utuado", "Vega Alta",
                "Vega Baja", "Vieques", "Villalba", "Yabucoa", "Yauco"};
        model.put("statuses", statuses);
        model.put("municipalities", municipalities);
        model.put("formBean", new FormBean());

        return FORM_VIEW;
    }


    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public ModelAndView handleData(@ModelAttribute("formBean") FormBean formBean) {

        int i = 0;
        List<ComercioPan> comercios = new ArrayList<ComercioPan>();
        WsEstablishments wservice = new WsEstablishments();
        WsEstablishmentsSoap port = wservice.getWsEstablishmentsSoap();
        com.services.ArrayOfOBJEstablishment response;

        {
            System.out.println("Invoking getEstablishments...");
            java.lang.String _getEstablishments_status = formBean.getStatus();
            java.lang.String _getEstablishments_establishment = formBean.getEstName();
            java.lang.String _getEstablishments_municipality = formBean.getMunicipality();
            response = port.getEstablishments(_getEstablishments_status, _getEstablishments_establishment, _getEstablishments_municipality);
            System.out.println("getEstablishments.result=" + response);
        }

        List<OBJEstablishment> resultList = response.getOBJEstablishment();
        for (i = 0; i < resultList.size(); i++) {
            OBJEstablishment obj = resultList.get(i);
            String LatLong[];
            if (!obj.getEstLatLong().isEmpty())
                LatLong = obj.getEstLatLong().split(",");
            else
                LatLong = new String[]{"0", "0"};
            ComercioPan cm = new ComercioPan(Float.parseFloat(LatLong[0]), Float.parseFloat(LatLong[1]), obj.getEstName());
            comercios.add(cm);
        }

        ModelAndView mv = new ModelAndView("map");
        mv.getModel().put("comercios", comercios);

        return mv;
    }

}