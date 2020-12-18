package com.demo.service.impl;



import java.util.List;



import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Shoe;
import com.demo.service.ShoeService;



@Service
public class ShoeServiceImpl implements ShoeService {

	private String url="http://localhost:9300/shoe/";
	private String urlShoes="http://localhost:9300/shoes/";
	
	private RestTemplate restTemplate=new RestTemplate();
	@Override
	public Shoe addShoe(Shoe shoe) {
		return restTemplate.postForObject(url, shoe, Shoe.class);
	}

	@Override
	public Shoe updateShoe(Shoe shoe) {
		restTemplate.put(url, shoe);
		return shoe;
	}

	@Override
	public Shoe getShoeById(int id) {
		ResponseEntity<Shoe> response=restTemplate.exchange(url+id, HttpMethod.GET,null,Shoe.class);
		return response.getBody();
	}

	@Override
	public void deleteShoeById(int id) {
		restTemplate.delete(url+id);
	}

	@Override
	public List<Shoe> getAllShoes() {
		ResponseEntity<List<Shoe>> response=restTemplate.exchange(urlShoes, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Shoe>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Shoe> getByName(String name) {
		ResponseEntity<List<Shoe>> response=restTemplate.exchange(urlShoes+name, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Shoe>>() {
		});
		return response.getBody();
	}

	@Override
	public List<Shoe> getShoesByManufacturerName(String manufacturerName) {
		ResponseEntity<List<Shoe>> response=restTemplate.exchange(urlShoes+manufacturerName, 
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<List<Shoe>>() {
		});
		return response.getBody();
	}

	

}
