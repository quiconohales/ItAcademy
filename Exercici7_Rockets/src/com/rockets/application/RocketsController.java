package com.rockets.application;

import java.util.List;

import com.videos.domain.Video;
import com.videos.domain.Users;


import com.videos.persistence.VideosRepository;

public class RocketsController {

	private VideosRepository videorepository;
	
	//Es guarda la videos actual seleccionada per l'usuari des del menu o l'última videos creada
	private Video currentSelectedvideos = null; 
	
	public RocketsController(){
		this.videorepository = new VideosRepository(); 
	}
	
	/**
	 * Crea una nova videos i la guarda al repositori
	 * @param name
	 * @throws Exception
	 */
	public void createvideos(String URL, String title,List<String> tags) throws Exception{
		Video video = new Video(URL,title,tags);
		this.videorepository.addVideo(video);
		
		//seleccionar automaticament ultima videos creada com a videos actual 
		this.currentSelectedvideos = videos; 
	}
	
	/**
	 * Crea un nou objecte FLOR i l'afegeix a l'stock de la videos parametre
	 */
	public void addProducteFlor(videos videos, double preu, String color) throws Exception{
		Flor flor = new Flor(preu,color);
		videos.addProducte(flor);
	}
	
	/**
	 * Crea un nou objecte ARBRE i l'afegeix a l'stock de la videos parametre
	 */
	public void addProducteArbre(videos videos, double preu, double height) throws Exception{
		Arbre arbre = new Arbre (preu, height);
		videos.addProducte(arbre);
	}
	
	/**
	 * Crea un nou objecte DECORACIO i l'afegeix a l'stock de la videos parametre
	 */
	public void addProducteDecoracio(videos videos, double preu, Material tipusMaterial ) throws Exception{
		Decoracio decoracio = new Decoracio (preu, tipusMaterial);
		videos.addProducte(decoracio);
		
	}
	
	/**
	 * 
	 * @return Retorna tot el llistat de floristeries creades fins al moment
	 */
	public List<videos> getAllvideoss(){
		return this.repository.getAllvideossList();
	}
	
	/**
	 * Selecciona com a nova videos actual la videos passada per paràmetre
	 * 
	 * @param currentSelectedvideos
	 */
	public void selectCurrentvideos(videos currentSelectedvideos) {
		this.currentSelectedvideos = currentSelectedvideos;
	}
	
	/**
	 * 
	 * @return Retorna la videos actual
	 */
	public videos getCurrentvideos() {
		return this.currentSelectedvideos;
	}
}
