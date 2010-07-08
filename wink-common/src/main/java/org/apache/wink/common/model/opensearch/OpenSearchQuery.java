/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *  
 *   http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.09.15 at 01:17:47 PM IDT 
//

package org.apache.wink.common.model.opensearch;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * The "Query" element per OpenSearch specification
 * 
 * <pre>
 * The &quot;Query&quot; element
 * 
 * Describes a specific search request that can be made by the search client.
 * 
 *     Attributes:
 * 
 *         role - Contains a string identifying how the search client should interpret the search request defined by this Query element.
 * 
 *             Restrictions: See the role values specification for allowed role values. 
 *             Requirements: This attribute is required. 
 * 
 *         title - Contains a human-readable plain text string describing the search request.
 * 
 *             Restrictions: The value must contain 256 or fewer characters of plain text. The value must not contain HTML or other markup. 
 *             Requirements: This attribute is optional. 
 * 
 *         totalResults - Contains the expected number of results to be found if the search request were made.
 * 
 *             Restrictions: The value is a non-negative integer. 
 *             Requirements: This attribute is optional. 
 * 
 *         searchTerms - Contains the value representing the &quot;searchTerms&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;searchTerms&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         count - Contains the value representing the &quot;count&quot; as a OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;count&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         startIndex - Contains the value representing the &quot;startIndex&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;startIndex&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         startPage - Contains the value representing the &quot;startPage&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;startPage&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         language - Contains the value representing the &quot;language&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;language&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         inputEncoding - Contains the value representing the &quot;inputEncoding&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;inputEncoding&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *         outputEncoding - Contains the value representing the &quot;outputEncoding&quot; as an OpenSearch 1.1 parameter.
 * 
 *             Restrictions: See the &quot;outputEncoding&quot; parameter. 
 *             Requirements: This attribute is optional. 
 * 
 *   Example:
 * 
 *     &lt;Query role=&quot;example&quot; searchTerms=&quot;cat&quot; /&gt;
 *  
 *  
 * o Query element extensibility
 * 
 *   The Query element may contain additional attributes if the extended attributes are associated with a namespace. Search clients should interpret extended attributes to represent the corresponding template parameter by the same name in the specified namespace.
 * 
 *   Example of a Query element representing a search request that contains an extended attribute that corresponds to an extended search parameter:
 * 
 *   &lt;OpenSearchDescription xmlns=&quot;http://a9.com/-/spec/opensearch/1.1/&quot;
 *                        xmlns:custom=&quot;http://example.com/opensearchextensions/1.0/&quot;&gt;
 *     &lt;Url type=&quot;text/html&quot;
 *          template=&quot;http://example.com/search?color={custom:color?}&quot; /&gt;
 *     &lt;Query role=&quot;example&quot;  custom:color=&quot;blue&quot; /&gt;
 *     &lt;!-- ... --&gt;
 *   &lt;/OpenSearchDescription&gt;
 * 
 * o Role values
 * 
 *   A role value consists of an optional prefix followed by the local role value. If the prefix is present it will be separated from the local role value with the &quot;:&quot; character. All role values are associated with a namespace, either implicitly in the case of local role values, or explicitly via a prefix in the case of fully qualified role values.
 *   Role extensibility
 * 
 *   The role attribute may take on values beyond those specified in this document provided they are fully qualified with a prefix and associated with a declared namespace. Clients that encounter unrecognized role values should continue to process the document as if the Query element containing the unrecognized role value did not appear.
 *   Role prefix
 * 
 *   A role prefix associates a local role name with a namespace. All prefixes must be previously declared as an XML namespace prefix on the containing Query element or ancestor elements.
 *   Local role values
 * 
 *   Local role values are not preceded by a prefix. Local role values are associated with the OpenSearch 1.1 namespace.
 * 
 *   The following role values are identified with the OpenSearch 1.1 namespace. The list is exhaustive; only the role values listed below may appear in the OpenSearch 1.1 namespace.
 * 
 *   Role values:
 * 
 *     &quot;request&quot;
 * 
 *         Represents the search query that can be performed to retrieve the same set of search results. 
 * 
 *     &quot;example&quot;
 * 
 *         Represents a search query that can be performed to demonstrate the search engine. 
 * 
 *     &quot;related&quot;
 * 
 *         Represents a search query that can be performed to retrieve similar but different search results. 
 * 
 *     &quot;correction&quot;
 * 
 *         Represents a search query that can be performed to improve the result set, such as with a spelling correction. 
 * 
 *     &quot;subset&quot;
 * 
 *         Represents a search query that will narrow the current set of search results. 
 * 
 *     &quot;superset&quot;
 * 
 *         Represents a search query that will broaden the current set of search results. 
 * 
 * 
 *   Example of a local role value:
 * 
 *    &lt;Query role=&quot;related&quot; 
 *         title=&quot;A related search&quot;
 *         searchTerms=&quot;tiger&quot; /&gt;
 * 
 * o Fully qualified role values
 * 
 *   Fully qualified role values are preceded by a prefix. Fully qualified role values are associated with the namespace identified by the prefix on the containing Query element or ancestor elements.
 * 
 *   Example of a fully qualified role value:
 * 
 *    &lt;Query xmlns:custom=&quot;http://example.com/opensearchextensions/1.0/&quot;
 *         role=&quot;custom:synonym&quot;
 *         title=&quot;Synonyms of 'cat'&quot;
 *         searchTerms=&quot;feline&quot; /&gt;
 * 
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenSearchQuery", propOrder = {})
public class OpenSearchQuery {

    @XmlAttribute(required = true)
    protected String           role;
    @XmlAttribute
    protected String           searchTerms;
    @XmlAttribute
    protected String           title;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger       totalResults;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger       count;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger       startPage;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger       startIndex;
    @XmlAttribute
    protected String           language;
    @XmlAttribute
    protected String           inputEncoding;
    @XmlAttribute
    protected String           outputEncoding;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    @XmlTransient
    public static enum QueryRole {
        request, example, related, correction, subset, superset
    }

    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link String }
     */
    public String getRole() {
        if (role == null) {
            return "example"; //$NON-NLS-1$
        } else {
            return role;
        }
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the searchTerms property.
     * 
     * @return possible object is {@link String }
     */
    public String getSearchTerms() {
        return searchTerms;
    }

    /**
     * Sets the value of the searchTerms property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setSearchTerms(String value) {
        this.searchTerms = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return possible object is {@link String }
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalResults property.
     * 
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getTotalResults() {
        return totalResults;
    }

    /**
     * Sets the value of the totalResults property.
     * 
     * @param value allowed object is {@link BigInteger }
     */
    public void setTotalResults(BigInteger value) {
        this.totalResults = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value allowed object is {@link BigInteger }
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value allowed object is {@link BigInteger }
     */
    public void setStartPage(BigInteger value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value allowed object is {@link BigInteger }
     */
    public void setStartIndex(BigInteger value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return possible object is {@link String }
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the inputEncoding property.
     * 
     * @return possible object is {@link String }
     */
    public String getInputEncoding() {
        return inputEncoding;
    }

    /**
     * Sets the value of the inputEncoding property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setInputEncoding(String value) {
        this.inputEncoding = value;
    }

    /**
     * Gets the value of the outputEncoding property.
     * 
     * @return possible object is {@link String }
     */
    public String getOutputEncoding() {
        return outputEncoding;
    }

    /**
     * Sets the value of the outputEncoding property.
     * 
     * @param value allowed object is {@link String }
     */
    public void setOutputEncoding(String value) {
        this.outputEncoding = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed
     * property on this class.
     * <p>
     * the map is keyed by the name of the attribute and the value is the string
     * value of the attribute. the map returned by this method is live, and you
     * can add new attribute by updating the map directly. Because of this
     * design, there's no setter.
     * 
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
