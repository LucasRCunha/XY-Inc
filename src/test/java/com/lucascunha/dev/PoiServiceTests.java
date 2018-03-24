package com.lucascunha.dev;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.lucascunha.dev.domain.Poi;
import com.lucascunha.dev.resources.PoiResource;
import com.lucascunha.dev.services.PoiService;


@RunWith(SpringRunner.class)
@WebMvcTest(PoiResource.class)
public class PoiServiceTests {

	@Autowired
	   private MockMvc mvc;

	   @MockBean
	   private PoiResource poiResource;

	   @Test
	   public void insertPoi() throws Exception {
	       Poi poi = new Poi(null,"shopping",22,22);
	       poiResource.insert(poi);
	       List<Poi> pois = (List<Poi>) poiResource.findAll();

	       assertThat(pois.size()).isEqualTo(1);
	   }

}
