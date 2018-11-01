/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pv254.dao;

import cz.muni.fi.pv254.entity.Recommendation;
import java.util.List;

/**
 *
 * @author Šimon Baláž
 */
public interface RecommendationDao {
    
    /**
     * Removes recommendation from database
     * @param recommendation to remove
     */
    public void remove(Recommendation recommendation);
    
    /**
     * Adds recommendation to databse
     * @param recommendation to add
     */
    public void add(Recommendation recommendation);
    
    /**
     * Updates existing recommendation in databse
     * @param recommendation to update
     */
    public void update(Recommendation recommendation);
    
    /**
     * Finds all recommendations
     * @return List of all recommendations
     */
    public List<Recommendation> findAll();
    
    /**
     * Finds recommendation by id
     * @param id of recommendation
     * @return Recommendation with specified id or null if no recommendation is found
     */
    public Recommendation findById(Long id);
}