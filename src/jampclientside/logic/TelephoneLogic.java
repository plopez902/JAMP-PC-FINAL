/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jampclientside.logic;

import jampclientside.entity.TelephoneBean;
import jampclientside.exceptions.BusinessLogicException;
import java.util.List;


/**
 * The telephone interface
 *
 * @author Julen
 */
public interface TelephoneLogic {

    public void startConnection() throws Exception;
    /**
     * this method is for delete telephone
     * 
     * @param phone the phone we want to delete
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public void deleteTelephone(TelephoneBean phone) throws BusinessLogicException;
    
    /**
     * This method is to update telephone
     * 
     * @param phone the phonne we want to update
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public void updateTelephone(TelephoneBean phone) throws BusinessLogicException;
    
    /**
     * This method is to create a telephone
     * 
     * @param phone the telephone we want to create
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public void createTelephone(TelephoneBean phone) throws BusinessLogicException;
    
    /**
     * This method to find all telephones
     * 
     * @return List of TelephoneBean with all telephones founds
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public List<TelephoneBean> findAllTelephone()throws BusinessLogicException;
    
    /**
     * This method is for find tlephone by id
     * 
     * @param idTelephone the telephone we want to find
     * @return TelephoneBean found
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public TelephoneBean findTelephoneById(Integer idTelephone)throws BusinessLogicException;
    
    /**
     * This method finnd telephones by name
     * 
     * @param name the name of telephone we want to found
     * @return List of telephoneBean with the name
     * @throws jampclientside.exceptions.BusinessLogicException 
     */
    public List<TelephoneBean> findTelephoneByName(String name)throws BusinessLogicException;
    

    
}
