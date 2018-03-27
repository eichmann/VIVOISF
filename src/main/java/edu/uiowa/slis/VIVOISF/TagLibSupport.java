package edu.uiowa.slis.VIVOISF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspTagException;

import java.util.Hashtable;
import java.util.Properties;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.tdb.TDBFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.uiowa.tagUtil.property.PropertyLoader;

@SuppressWarnings("serial")
public class TagLibSupport extends javax.servlet.jsp.tagext.TagSupport {
	private static final Log log = LogFactory.getLog(TagLibSupport.class);
	static protected String prefix = 
		"PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
			+ "PREFIX bibo: <http://purl.org/ontology/bibo/>"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
			+ "PREFIX vivo: <http://vivoweb.org/ontology/core#>";
	static Hashtable<String, String> classNameHash = new Hashtable<String, String>();
	static Hashtable<String, String> classLocalNameHash = new Hashtable<String, String>();

	static {
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Geo", "Geo");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000008", "BFO_0000008");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000006", "BFO_0000006");
		classNameHash.put("http://vivoweb.org/ontology/core#Relationship", "Relationship");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000009", "IAO_0000009");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeValuePrecision", "DateTimeValuePrecision");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000004", "BFO_0000004");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Name", "Name");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000003", "BFO_0000003");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000002", "BFO_0000002");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000001", "BFO_0000001");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000003", "IAO_0000003");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#area", "Area");
		classNameHash.put("http://vivoweb.org/ontology/core#Location", "Location");
		classNameHash.put("http://vivoweb.org/ontology/core#FacultyPosition", "FacultyPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Position", "Position");
		classNameHash.put("http://www.w3.org/2002/07/owl#DatatypeProperty", "DatatypeProperty");
		classNameHash.put("http://vivoweb.org/ontology/core#Company", "Company");
		classNameHash.put("http://xmlns.com/foaf/0.1/Organization", "Organization");
		classNameHash.put("http://vivoweb.org/ontology/core#ConferencePaper", "ConferencePaper");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Calendar", "Calendar");
		classNameHash.put("http://vivoweb.org/ontology/core#GeographicRegion", "GeographicRegion");
		classNameHash.put("http://www.w3.org/2002/07/owl#Restriction", "Restriction");
		classNameHash.put("http://purl.org/ontology/bibo/Conference", "Conference");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000148", "BFO_0000148");
		classNameHash.put("http://vivoweb.org/ontology/core#Authorship", "Authorship");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Addressing", "Addressing");
		classNameHash.put("http://www.w3.org/2002/07/owl#Class", "Class");
		classNameHash.put("http://www.w3.org/2002/07/owl#InverseFunctionalProperty", "InverseFunctionalProperty");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000141", "BFO_0000141");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Kind", "Kind");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Code", "Code");
		classNameHash.put("http://www.w3.org/2002/07/owl#SymmetricProperty", "SymmetricProperty");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeInterval", "DateTimeInterval");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Geographical", "Geographical");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#self_governing", "Self_governing");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#TimeZone", "TimeZone");
		classNameHash.put("http://vivoweb.org/ontology/core#PrimaryPosition", "PrimaryPosition");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Individual", "Individual");
		classNameHash.put("http://www.w3.org/2002/07/owl#IrreflexiveProperty", "IrreflexiveProperty");
		classNameHash.put("http://purl.org/ontology/bibo/AudioVisualDocument", "AudioVisualDocument");
		classNameHash.put("http://vivoweb.org/ontology/core#Publisher", "Publisher");
		classNameHash.put("http://www.w3.org/2002/07/owl#Ontology", "Ontology");
		classNameHash.put("http://vivoweb.org/ontology/core#Country", "Country");
		classNameHash.put("http://vivoweb.org/ontology/core#FacultyAdministrativePosition", "FacultyAdministrativePosition");
		classNameHash.put("http://purl.org/ontology/bibo/Slideshow", "Slideshow");
		classNameHash.put("http://www.w3.org/2000/01/rdf-schema#Datatype", "Datatype");
		classNameHash.put("http://purl.obolibrary.org/obo/ARG_2000379", "ARG_2000379");
		classNameHash.put("http://vivoweb.org/ontology/core#StateOrProvince", "StateOrProvince");
		classNameHash.put("http://www.w3.org/2002/07/owl#ReflexiveProperty", "ReflexiveProperty");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Work", "Work");
		classNameHash.put("http://purl.org/ontology/bibo/Journal", "Journal");
		classNameHash.put("http://purl.org/ontology/bibo/DocumentStatus", "DocumentStatus");
		classNameHash.put("http://vivoweb.org/ontology/core#Editorship", "Editorship");
		classNameHash.put("http://purl.org/ontology/bibo/Collection", "Collection");
		classNameHash.put("http://vivoweb.org/ontology/core#NonAcademicPosition", "NonAcademicPosition");
		classNameHash.put("http://purl.org/ontology/bibo/Periodical", "Periodical");
		classNameHash.put("http://purl.org/ontology/bibo/Report", "Report");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#URL", "URL");
		classNameHash.put("http://purl.org/ontology/bibo/Article", "Article");
		classNameHash.put("http://vivoweb.org/ontology/core#GeopoliticalEntity", "GeopoliticalEntity");
		classNameHash.put("http://vivoweb.org/ontology/core#LibrarianPosition", "LibrarianPosition");
		classNameHash.put("http://purl.org/ontology/bibo/Chapter", "Chapter");
		classNameHash.put("http://xmlns.com/foaf/0.1/Agent", "Agent");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#group", "Group");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#economic_region", "Economic_region");
		classNameHash.put("http://vivoweb.org/ontology/core#PostdocPosition", "PostdocPosition");
		classNameHash.put("http://purl.org/NET/c4dm/event.owl#Event", "Event");
		classNameHash.put("http://purl.org/ontology/bibo/DocumentPart", "DocumentPart");
		classNameHash.put("http://purl.obolibrary.org/obo/UO_0000280", "UO_0000280");
		classNameHash.put("http://vivoweb.org/ontology/core#ResearcherRole", "ResearcherRole");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#other", "Other");
		classNameHash.put("http://www.w3.org/2002/07/owl#AnnotationProperty", "AnnotationProperty");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Explanatory", "Explanatory");
		classNameHash.put("http://www.w3.org/2002/07/owl#TransitiveProperty", "TransitiveProperty");
		classNameHash.put("http://vivoweb.org/ontology/core#ConferencePoster", "ConferencePoster");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#non_self_governing", "Non_self_governing");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#territory", "Territory");
		classNameHash.put("http://xmlns.com/foaf/0.1/Person", "Person");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#geographical_region", "Geographical_region");
		classNameHash.put("http://vivoweb.org/ontology/core#GeographicLocation", "GeographicLocation");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Email", "Email");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Title", "Title");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Concept", "Concept");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Communication", "Communication");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Organizational", "Organizational");
		classNameHash.put("http://www.w3.org/2002/07/owl#AsymmetricProperty", "AsymmetricProperty");
		classNameHash.put("http://purl.org/ontology/bibo/Document", "Document");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeValue", "DateTimeValue");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000038", "BFO_0000038");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#special_group", "Special_group");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Security", "Security");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000031", "BFO_0000031");
		classNameHash.put("http://vivoweb.org/ontology/core#GovernmentAgency", "GovernmentAgency");
		classNameHash.put("http://www.w3.org/2002/07/owl#FunctionalProperty", "FunctionalProperty");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000030", "IAO_0000030");
		classNameHash.put("http://purl.org/ontology/bibo/Book", "Book");
		classNameHash.put("http://www.w3.org/2002/07/owl#ObjectProperty", "ObjectProperty");
		classNameHash.put("http://vivoweb.org/ontology/core#Dataset", "Dataset");
		classNameHash.put("http://vivoweb.org/ontology/core#NonFacultyAcademicPosition", "NonFacultyAcademicPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Continent", "Continent");
		classNameHash.put("http://www.w3.org/2002/07/owl#NamedIndividual", "NamedIndividual");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Identification", "Identification");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Telephone", "Telephone");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Type", "Type");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000023", "BFO_0000023");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000020", "BFO_0000020");
		classNameHash.put("http://vivoweb.org/ontology/core#AcademicDegree", "AcademicDegree");
		classNameHash.put("http://purl.org/ontology/bibo/AcademicArticle", "AcademicArticle");
		classNameHash.put("http://www.w3.org/2002/07/owl#Thing", "Thing");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000017", "BFO_0000017");
		classNameHash.put("http://purl.org/ontology/bibo/BookSection", "BookSection");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000015", "BFO_0000015");

		classLocalNameHash.put("Geo", "http://www.w3.org/2006/vcard/ns#Geo");
		classLocalNameHash.put("BFO_0000008", "http://purl.obolibrary.org/obo/BFO_0000008");
		classLocalNameHash.put("BFO_0000006", "http://purl.obolibrary.org/obo/BFO_0000006");
		classLocalNameHash.put("Relationship", "http://vivoweb.org/ontology/core#Relationship");
		classLocalNameHash.put("IAO_0000009", "http://purl.obolibrary.org/obo/IAO_0000009");
		classLocalNameHash.put("DateTimeValuePrecision", "http://vivoweb.org/ontology/core#DateTimeValuePrecision");
		classLocalNameHash.put("BFO_0000004", "http://purl.obolibrary.org/obo/BFO_0000004");
		classLocalNameHash.put("Name", "http://www.w3.org/2006/vcard/ns#Name");
		classLocalNameHash.put("BFO_0000003", "http://purl.obolibrary.org/obo/BFO_0000003");
		classLocalNameHash.put("BFO_0000002", "http://purl.obolibrary.org/obo/BFO_0000002");
		classLocalNameHash.put("BFO_0000001", "http://purl.obolibrary.org/obo/BFO_0000001");
		classLocalNameHash.put("IAO_0000003", "http://purl.obolibrary.org/obo/IAO_0000003");
		classLocalNameHash.put("Area", "http://aims.fao.org/aos/geopolitical.owl#area");
		classLocalNameHash.put("Location", "http://vivoweb.org/ontology/core#Location");
		classLocalNameHash.put("FacultyPosition", "http://vivoweb.org/ontology/core#FacultyPosition");
		classLocalNameHash.put("Position", "http://vivoweb.org/ontology/core#Position");
		classLocalNameHash.put("DatatypeProperty", "http://www.w3.org/2002/07/owl#DatatypeProperty");
		classLocalNameHash.put("Company", "http://vivoweb.org/ontology/core#Company");
		classLocalNameHash.put("Organization", "http://xmlns.com/foaf/0.1/Organization");
		classLocalNameHash.put("ConferencePaper", "http://vivoweb.org/ontology/core#ConferencePaper");
		classLocalNameHash.put("Calendar", "http://www.w3.org/2006/vcard/ns#Calendar");
		classLocalNameHash.put("GeographicRegion", "http://vivoweb.org/ontology/core#GeographicRegion");
		classLocalNameHash.put("Restriction", "http://www.w3.org/2002/07/owl#Restriction");
		classLocalNameHash.put("Conference", "http://purl.org/ontology/bibo/Conference");
		classLocalNameHash.put("BFO_0000148", "http://purl.obolibrary.org/obo/BFO_0000148");
		classLocalNameHash.put("Authorship", "http://vivoweb.org/ontology/core#Authorship");
		classLocalNameHash.put("Addressing", "http://www.w3.org/2006/vcard/ns#Addressing");
		classLocalNameHash.put("Class", "http://www.w3.org/2002/07/owl#Class");
		classLocalNameHash.put("InverseFunctionalProperty", "http://www.w3.org/2002/07/owl#InverseFunctionalProperty");
		classLocalNameHash.put("BFO_0000141", "http://purl.obolibrary.org/obo/BFO_0000141");
		classLocalNameHash.put("Kind", "http://www.w3.org/2006/vcard/ns#Kind");
		classLocalNameHash.put("Code", "http://www.w3.org/2006/vcard/ns#Code");
		classLocalNameHash.put("SymmetricProperty", "http://www.w3.org/2002/07/owl#SymmetricProperty");
		classLocalNameHash.put("DateTimeInterval", "http://vivoweb.org/ontology/core#DateTimeInterval");
		classLocalNameHash.put("Geographical", "http://www.w3.org/2006/vcard/ns#Geographical");
		classLocalNameHash.put("Self_governing", "http://aims.fao.org/aos/geopolitical.owl#self_governing");
		classLocalNameHash.put("TimeZone", "http://www.w3.org/2006/vcard/ns#TimeZone");
		classLocalNameHash.put("PrimaryPosition", "http://vivoweb.org/ontology/core#PrimaryPosition");
		classLocalNameHash.put("Individual", "http://www.w3.org/2006/vcard/ns#Individual");
		classLocalNameHash.put("IrreflexiveProperty", "http://www.w3.org/2002/07/owl#IrreflexiveProperty");
		classLocalNameHash.put("AudioVisualDocument", "http://purl.org/ontology/bibo/AudioVisualDocument");
		classLocalNameHash.put("Publisher", "http://vivoweb.org/ontology/core#Publisher");
		classLocalNameHash.put("Ontology", "http://www.w3.org/2002/07/owl#Ontology");
		classLocalNameHash.put("Country", "http://vivoweb.org/ontology/core#Country");
		classLocalNameHash.put("FacultyAdministrativePosition", "http://vivoweb.org/ontology/core#FacultyAdministrativePosition");
		classLocalNameHash.put("Slideshow", "http://purl.org/ontology/bibo/Slideshow");
		classLocalNameHash.put("Datatype", "http://www.w3.org/2000/01/rdf-schema#Datatype");
		classLocalNameHash.put("ARG_2000379", "http://purl.obolibrary.org/obo/ARG_2000379");
		classLocalNameHash.put("StateOrProvince", "http://vivoweb.org/ontology/core#StateOrProvince");
		classLocalNameHash.put("ReflexiveProperty", "http://www.w3.org/2002/07/owl#ReflexiveProperty");
		classLocalNameHash.put("Work", "http://www.w3.org/2006/vcard/ns#Work");
		classLocalNameHash.put("Journal", "http://purl.org/ontology/bibo/Journal");
		classLocalNameHash.put("DocumentStatus", "http://purl.org/ontology/bibo/DocumentStatus");
		classLocalNameHash.put("Editorship", "http://vivoweb.org/ontology/core#Editorship");
		classLocalNameHash.put("Collection", "http://purl.org/ontology/bibo/Collection");
		classLocalNameHash.put("NonAcademicPosition", "http://vivoweb.org/ontology/core#NonAcademicPosition");
		classLocalNameHash.put("Periodical", "http://purl.org/ontology/bibo/Periodical");
		classLocalNameHash.put("Report", "http://purl.org/ontology/bibo/Report");
		classLocalNameHash.put("URL", "http://www.w3.org/2006/vcard/ns#URL");
		classLocalNameHash.put("Article", "http://purl.org/ontology/bibo/Article");
		classLocalNameHash.put("GeopoliticalEntity", "http://vivoweb.org/ontology/core#GeopoliticalEntity");
		classLocalNameHash.put("LibrarianPosition", "http://vivoweb.org/ontology/core#LibrarianPosition");
		classLocalNameHash.put("Chapter", "http://purl.org/ontology/bibo/Chapter");
		classLocalNameHash.put("Agent", "http://xmlns.com/foaf/0.1/Agent");
		classLocalNameHash.put("Group", "http://aims.fao.org/aos/geopolitical.owl#group");
		classLocalNameHash.put("Economic_region", "http://aims.fao.org/aos/geopolitical.owl#economic_region");
		classLocalNameHash.put("PostdocPosition", "http://vivoweb.org/ontology/core#PostdocPosition");
		classLocalNameHash.put("Event", "http://purl.org/NET/c4dm/event.owl#Event");
		classLocalNameHash.put("DocumentPart", "http://purl.org/ontology/bibo/DocumentPart");
		classLocalNameHash.put("UO_0000280", "http://purl.obolibrary.org/obo/UO_0000280");
		classLocalNameHash.put("ResearcherRole", "http://vivoweb.org/ontology/core#ResearcherRole");
		classLocalNameHash.put("Other", "http://aims.fao.org/aos/geopolitical.owl#other");
		classLocalNameHash.put("AnnotationProperty", "http://www.w3.org/2002/07/owl#AnnotationProperty");
		classLocalNameHash.put("Explanatory", "http://www.w3.org/2006/vcard/ns#Explanatory");
		classLocalNameHash.put("TransitiveProperty", "http://www.w3.org/2002/07/owl#TransitiveProperty");
		classLocalNameHash.put("ConferencePoster", "http://vivoweb.org/ontology/core#ConferencePoster");
		classLocalNameHash.put("Non_self_governing", "http://aims.fao.org/aos/geopolitical.owl#non_self_governing");
		classLocalNameHash.put("Territory", "http://aims.fao.org/aos/geopolitical.owl#territory");
		classLocalNameHash.put("Person", "http://xmlns.com/foaf/0.1/Person");
		classLocalNameHash.put("Geographical_region", "http://aims.fao.org/aos/geopolitical.owl#geographical_region");
		classLocalNameHash.put("GeographicLocation", "http://vivoweb.org/ontology/core#GeographicLocation");
		classLocalNameHash.put("Email", "http://www.w3.org/2006/vcard/ns#Email");
		classLocalNameHash.put("Title", "http://www.w3.org/2006/vcard/ns#Title");
		classLocalNameHash.put("Concept", "http://www.w3.org/2004/02/skos/core#Concept");
		classLocalNameHash.put("Communication", "http://www.w3.org/2006/vcard/ns#Communication");
		classLocalNameHash.put("Organizational", "http://www.w3.org/2006/vcard/ns#Organizational");
		classLocalNameHash.put("AsymmetricProperty", "http://www.w3.org/2002/07/owl#AsymmetricProperty");
		classLocalNameHash.put("Document", "http://purl.org/ontology/bibo/Document");
		classLocalNameHash.put("DateTimeValue", "http://vivoweb.org/ontology/core#DateTimeValue");
		classLocalNameHash.put("BFO_0000038", "http://purl.obolibrary.org/obo/BFO_0000038");
		classLocalNameHash.put("Special_group", "http://aims.fao.org/aos/geopolitical.owl#special_group");
		classLocalNameHash.put("Security", "http://www.w3.org/2006/vcard/ns#Security");
		classLocalNameHash.put("BFO_0000031", "http://purl.obolibrary.org/obo/BFO_0000031");
		classLocalNameHash.put("GovernmentAgency", "http://vivoweb.org/ontology/core#GovernmentAgency");
		classLocalNameHash.put("FunctionalProperty", "http://www.w3.org/2002/07/owl#FunctionalProperty");
		classLocalNameHash.put("IAO_0000030", "http://purl.obolibrary.org/obo/IAO_0000030");
		classLocalNameHash.put("Book", "http://purl.org/ontology/bibo/Book");
		classLocalNameHash.put("ObjectProperty", "http://www.w3.org/2002/07/owl#ObjectProperty");
		classLocalNameHash.put("Dataset", "http://vivoweb.org/ontology/core#Dataset");
		classLocalNameHash.put("NonFacultyAcademicPosition", "http://vivoweb.org/ontology/core#NonFacultyAcademicPosition");
		classLocalNameHash.put("Continent", "http://vivoweb.org/ontology/core#Continent");
		classLocalNameHash.put("NamedIndividual", "http://www.w3.org/2002/07/owl#NamedIndividual");
		classLocalNameHash.put("Identification", "http://www.w3.org/2006/vcard/ns#Identification");
		classLocalNameHash.put("Telephone", "http://www.w3.org/2006/vcard/ns#Telephone");
		classLocalNameHash.put("Type", "http://www.w3.org/2006/vcard/ns#Type");
		classLocalNameHash.put("BFO_0000023", "http://purl.obolibrary.org/obo/BFO_0000023");
		classLocalNameHash.put("BFO_0000020", "http://purl.obolibrary.org/obo/BFO_0000020");
		classLocalNameHash.put("AcademicDegree", "http://vivoweb.org/ontology/core#AcademicDegree");
		classLocalNameHash.put("AcademicArticle", "http://purl.org/ontology/bibo/AcademicArticle");
		classLocalNameHash.put("Thing", "http://www.w3.org/2002/07/owl#Thing");
		classLocalNameHash.put("BFO_0000017", "http://purl.obolibrary.org/obo/BFO_0000017");
		classLocalNameHash.put("BookSection", "http://purl.org/ontology/bibo/BookSection");
		classLocalNameHash.put("BFO_0000015", "http://purl.obolibrary.org/obo/BFO_0000015");
	}

	boolean useSPARQL = true;
	Dataset dataset = null;
	String tripleStore = null;
	String endpoint = null;
	Properties properties = null;

	private void loadProperties() throws JspTagException {
		if (properties != null)
			return;

		try {
			String theURI = ((HttpServletRequest)pageContext.getRequest()).getRequestURI();
			String applicationRoot = theURI.substring(0, theURI.indexOf('/', 1));
			log.info("loading " + applicationRoot + ".properties");
			properties = PropertyLoader.loadProperties(applicationRoot + ".properties");
		} catch (Exception e) {
			log.info("failed...");
		}

		if (properties == null) {
			try {
				log.info("loading viva.properties");
				properties = PropertyLoader.loadProperties("viva.properties");
			} catch (Exception e) {
				log.info("failed...");
			}
		}

		if (properties == null) {
			try {
				log.info("loading VIVOISF.properties");
				properties = PropertyLoader.loadProperties("VIVOISF.properties");
			} catch (Exception e) {
				log.info("failed...");
				throw new JspTagException("missing property file!");
			}
		}

		String redirect = properties.getProperty("VIVOISF_properties");
		if (redirect != null) {
			log.info("loading VIVOISF redirection: " + redirect);
			properties = PropertyLoader.loadProperties(redirect);
		}

		useSPARQL = properties.getProperty("useSPARQL", "true").equals("true");
		endpoint = properties.getProperty("endpoint", "localhost");
		tripleStore = properties.getProperty("tripleStore", "localhost");

	}


	public ResultSet getResultSet(String queryString) throws JspTagException {
		loadProperties();
		if (useSPARQL) {
			Query theClassQuery = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution theClassExecution = QueryExecutionFactory.sparqlService(endpoint, theClassQuery);
			return theClassExecution.execSelect();
		} else {
			dataset = TDBFactory.createDataset(tripleStore);
			Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			return qexec.execSelect();
		}
	}

	public void freeConnection() {
		if (!useSPARQL) {
			//dataset.close();
		}
	}

	public String getLocalName(String classString) {
		if (classString == null) {
			return null;
		}
		return classNameHash.get(classString);
	}

}
