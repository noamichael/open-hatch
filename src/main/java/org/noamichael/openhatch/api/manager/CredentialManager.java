package org.noamichael.openhatch.api.manager;

import java.util.Collection;
import javax.xml.bind.JAXBException;
import org.noamichael.openhatch.api.authentication.AbstractCredentialSet;
import org.noamichael.openhatch.api.authentication.AuthenticationResult;
import org.noamichael.openhatch.api.authentication.SearchParameter;
import org.noamichael.openhatch.impl.schema.CredentialSet;

/**
 * The class responsible for the CRUD operations on {@link CredentialSet}
 * 
 * @author michael
 */
public interface CredentialManager {
    /**
     * Adds a credential set to the underlying database.
     *
     * @param set The set to add.
     */
    public void addCredentialSet(CredentialSet set);

    /**
     * Removes a credential set from the underlying database.
     *
     * @param set
     */
    public void removeCredentialSet(CredentialSet set);

    /**
     * Updates a credential set in the database.
     *
     * @param set
     */
    public void updateCredentialSet(CredentialSet set);

    /**
     * Returns a credential set based on the SearchParameter.
     *
     * @param <T>
     * @param param
     * @return
     */
    public <T> CredentialSet findCredentialSet(SearchParameter<T> param);

    /**
     * Validates a credential set and returns the result.
     *
     * @param <T>
     * @param paramT
     * @return
     */
    public <T extends AbstractCredentialSet> AuthenticationResult validateCredentials(T paramT);

    /**
     * Returns the given credential set as an String.
     *
     * @param set
     * @return
     * @throws JAXBException
     */
    public String getAsXmlString(CredentialSet set) throws JAXBException;

    /**
     * Gets the credential set Object as a String.
     *
     * @param xml
     * @return
     * @throws JAXBException
     */
    public CredentialSet getAsObject(String xml) throws JAXBException;

    /**
     * Returns all of the credential sets of the given type.
     * @param clazz
     * @return 
     */
    public Collection<CredentialSet> getAllCredentials(Class<? extends CredentialSet> clazz);

    /**
     * returns all credentials.
     * @return 
     */
    public Collection<CredentialSet> getAllCredentials();
}
