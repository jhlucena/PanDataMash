package com.springapp.mvc;

import com.model.*;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PanController {

    private String FORM_VIEW = "query";
    private List<FsData> dataFsPercents;
    private Map<String, Integer> fipsCodes;

    public PanController() {
        // Initialize Data from Excel...
        // Get fips codes from excel
        try {
            ExcelOdbcDao dao = new ExcelOdbcDao();
            // connect...
            dao.connect();
            // Get fips...
            fipsCodes = dao.selectAllFipsCodes();
            // Get FoodStamp Percents
            dataFsPercents = dao.selectAllFoodStampPercents();
            dao.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String createForm(ModelMap model) {
        //Add dropbox items
        final String statuses[] = {"ACTIVO", "INACTIVO"};
        final String municipalities[] = {"ADJUNTAS", "AGUADA", "AGUADILLA", "AGUAS BUENAS", "AIBONITO", "ANASCO", "ARECIBO",
                "ARROYO", "BARCELONETA", "BARRANQUITAS", "BAYAMON", "CABO ROJO", "CAGUAS", "CAMUY",
                "CANOVANAS", "CAROLINA", "CATANO", "CAYEY", "CEIBA", "CIALES", "CIDRA", "COAMO",
                "COMERIO", "COROZAL", "CULEBRA", "DORADO", "FAJARDO", "FLORIDA", "GUANICA", "GUAYAMA",
                "GUAYANILLA", "GUAYNABO", "GURABO", "HATILLO", "HORMIGUEROS", "HUMACAO", "ISABELA",
                "JAYUYA", "JUANA DIAZ", "JUNCOS", "LAJAS", "LARES", "LAS MARIAS", "LAS PIEDRAS",
                "LOIZA", "LUQUILLO", "MANATI", "MARICAO", "MAUNABO", "MAYAGUEZ", "MOCA", "MOROVIS",
                "NAGUABO", "NARANJITO", "OROCOVIS", "PATILLAS", "PENUELAS", "PONCE", "QUEBRADILLAS",
                "RINCON", "RIO GRANDE", "SABANA GRANDE", "SALINAS", "SAN GERMAN", "SAN JUAN", "SAN LORENZO",
                "SAN SEBASTIAN", "SANTA ISABEL", "TOA ALTA", "TOA BAJA", "TRUJILLO ALTO", "UTUADO", "VEGA ALTA",
                "VEGA BAJA", "VIEQUES", "VILLALBA", "YABUCOA", "YAUCO"};
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

        //Get fips from list....
        Integer code = fipsCodes.get(formBean.getMunicipality());
        // Get Food Stamp estimate from List
        float percent = 0;
        int count = 0;
        for (FsData data : dataFsPercents) {
            if (data.getCounty_fips() == code.intValue()) {
                percent += data.getPercent();
                count++;
            }
        }
        float avgPercent = percent / count;

        List<OBJEstablishment> resultList = response.getOBJEstablishment();
        for (i = 0; i < resultList.size(); i++) {
            OBJEstablishment obj = resultList.get(i);
            String LatLong[];
            if (!obj.getEstLatLong().isEmpty())
                LatLong = obj.getEstLatLong().split(",");
            else
                LatLong = new String[]{"0", "0"};

            // Generate infoText
            String text = "<p style=\"font: bold 13px auto Arial;\"> Comercio: " + obj.getEstName() + "<br/> Estatus como proveedor PAN: " + obj.getEstStatus() + "<br/>" +
                    "Porciento de Poblacion que utiliza beneficios PAN en este municipio en los ultimos 12 meses: " + avgPercent + "% <br/>" +
                    "Provee WIC?: " + (obj.getOEstablishmentOtherData().isWICAuthorized() ? "SI" : "NO") + "<br/></p>";

            ComercioPan cm = new ComercioPan(Float.parseFloat(LatLong[0]), Float.parseFloat(LatLong[1]), obj.getEstName(), text);
            comercios.add(cm);
        }


        ModelAndView mv = new ModelAndView("map");
        mv.getModel().put("comercios", comercios);
        mv.getModel().put("municipio", formBean.getMunicipality());

        return mv;
    }

}