package edu.uiowa.slis.VIVOISF;

import java.util.Hashtable;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.tdb.TDBFactory;

@SuppressWarnings("serial")
public class TagLibSupport extends javax.servlet.jsp.tagext.TagSupport {
	static final boolean useSPARQL = false;
	static String endpoint = "http://marengo.info-science.uiowa.edu:2021/sparql";
	static protected String prefix = 
		"PREFIX foaf: <http://xmlns.com/foaf/0.1/>"
			+ "PREFIX bibo: <http://purl.org/ontology/bibo/>"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
			+ "PREFIX vivo: <http://vivoweb.org/ontology/core#>";
	static Hashtable<String, String> classNameHash = new Hashtable<String, String>();
	static Hashtable<String, String> classLocalNameHash = new Hashtable<String, String>();

	static {
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#group", "group");
		classNameHash.put("http://vivoweb.org/ontology/core#LibrarianPosition", "LibrarianPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Location", "Location");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#special_group", "special_group");
		classNameHash.put("http://purl.org/ontology/bibo/Journal", "Journal");
		classNameHash.put("http://vivoweb.org/ontology/core#Relationship", "Relationship");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Individual", "Individual");
		classNameHash.put("http://purl.org/ontology/bibo/Chapter", "Chapter");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000038", "BFO_0000038");
		classNameHash.put("http://vivoweb.org/ontology/core#AcademicDegree", "AcademicDegree");
		classNameHash.put("http://purl.org/ontology/bibo/Article", "Article");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#TimeZone", "TimeZone");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#geographical_region", "geographical_region");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Identification", "Identification");
		classNameHash.put("http://vivoweb.org/ontology/core#NonAcademicPosition", "NonAcademicPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#ResearcherRole", "ResearcherRole");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Explanatory", "Explanatory");
		classNameHash.put("http://purl.org/NET/c4dm/event.owl#Event", "Event");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Calendar", "Calendar");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Security", "Security");
		classNameHash.put("http://purl.org/ontology/bibo/AcademicArticle", "AcademicArticle");
		classNameHash.put("http://vivoweb.org/ontology/core#Country", "Country");
		classNameHash.put("http://vivoweb.org/ontology/core#ConferencePoster", "ConferencePoster");
		classNameHash.put("http://xmlns.com/foaf/0.1/Person", "Person");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000002", "BFO_0000002");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000015", "BFO_0000015");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000031", "BFO_0000031");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Geo", "Geo");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000023", "BFO_0000023");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeInterval", "DateTimeInterval");
		classNameHash.put("http://vivoweb.org/ontology/core#GovernmentAgency", "GovernmentAgency");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000148", "BFO_0000148");
		classNameHash.put("http://purl.org/ontology/bibo/Document", "Document");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000009", "IAO_0000009");
		classNameHash.put("http://vivoweb.org/ontology/core#Position", "Position");
		classNameHash.put("http://vivoweb.org/ontology/core#PostdocPosition", "PostdocPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Editorship", "Editorship");
		classNameHash.put("http://purl.org/ontology/bibo/Collection", "Collection");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Work", "Work");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Type", "Type");
		classNameHash.put("http://purl.obolibrary.org/obo/ARG_2000379", "ARG_2000379");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000003", "IAO_0000003");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeValue", "DateTimeValue");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#economic_region", "economic_region");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000001", "BFO_0000001");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Kind", "Kind");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000017", "BFO_0000017");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#territory", "territory");
		classNameHash.put("http://vivoweb.org/ontology/core#Continent", "Continent");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Organizational", "Organizational");
		classNameHash.put("http://xmlns.com/foaf/0.1/Agent", "Agent");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000141", "BFO_0000141");
		classNameHash.put("http://vivoweb.org/ontology/core#Authorship", "Authorship");
		classNameHash.put("http://vivoweb.org/ontology/core#NonFacultyAcademicPosition", "NonFacultyAcademicPosition");
		classNameHash.put("http://purl.org/ontology/bibo/DocumentStatus", "DocumentStatus");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#non_self_governing", "non_self_governing");
		classNameHash.put("http://purl.org/ontology/bibo/DocumentPart", "DocumentPart");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Code", "Code");
		classNameHash.put("http://purl.obolibrary.org/obo/UO_0000280", "UO_0000280");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Addressing", "Addressing");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000008", "BFO_0000008");
		classNameHash.put("http://purl.org/ontology/bibo/Conference", "Conference");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#area", "area");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Title", "Title");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Communication", "Communication");
		classNameHash.put("http://vivoweb.org/ontology/core#FacultyPosition", "FacultyPosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Company", "Company");
		classNameHash.put("http://vivoweb.org/ontology/core#Publisher", "Publisher");
		classNameHash.put("http://vivoweb.org/ontology/core#DateTimeValuePrecision", "DateTimeValuePrecision");
		classNameHash.put("http://vivoweb.org/ontology/core#GeopoliticalEntity", "GeopoliticalEntity");
		classNameHash.put("http://vivoweb.org/ontology/core#StateOrProvince", "StateOrProvince");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Name", "Name");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Telephone", "Telephone");
		classNameHash.put("http://vivoweb.org/ontology/core#GeographicLocation", "GeographicLocation");
		classNameHash.put("http://purl.org/ontology/bibo/Periodical", "Periodical");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Concept", "Concept");
		classNameHash.put("http://purl.org/ontology/bibo/BookSection", "BookSection");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000004", "BFO_0000004");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000020", "BFO_0000020");
		classNameHash.put("http://purl.obolibrary.org/obo/IAO_0000030", "IAO_0000030");
		classNameHash.put("http://vivoweb.org/ontology/core#GeographicRegion", "GeographicRegion");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Email", "Email");
		classNameHash.put("http://purl.org/ontology/bibo/Slideshow", "Slideshow");
		classNameHash.put("http://vivoweb.org/ontology/core#FacultyAdministrativePosition", "FacultyAdministrativePosition");
		classNameHash.put("http://vivoweb.org/ontology/core#Dataset", "Dataset");
		classNameHash.put("http://purl.org/ontology/bibo/Book", "Book");
		classNameHash.put("http://purl.org/ontology/bibo/Report", "Report");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#Geographical", "Geographical");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#other", "other");
		classNameHash.put("http://www.w3.org/2006/vcard/ns#URL", "URL");
		classNameHash.put("http://vivoweb.org/ontology/core#ConferencePaper", "ConferencePaper");
		classNameHash.put("http://vivoweb.org/ontology/core#PrimaryPosition", "PrimaryPosition");
		classNameHash.put("http://xmlns.com/foaf/0.1/Organization", "Organization");
		classNameHash.put("http://aims.fao.org/aos/geopolitical.owl#self_governing", "self_governing");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000006", "BFO_0000006");
		classNameHash.put("http://www.w3.org/2002/07/owl#Thing", "Thing");
		classNameHash.put("http://purl.org/ontology/bibo/AudioVisualDocument", "AudioVisualDocument");
		classNameHash.put("http://purl.obolibrary.org/obo/BFO_0000003", "BFO_0000003");

		classLocalNameHash.put("group", "http://aims.fao.org/aos/geopolitical.owl#group");
		classLocalNameHash.put("LibrarianPosition", "http://vivoweb.org/ontology/core#LibrarianPosition");
		classLocalNameHash.put("Location", "http://vivoweb.org/ontology/core#Location");
		classLocalNameHash.put("special_group", "http://aims.fao.org/aos/geopolitical.owl#special_group");
		classLocalNameHash.put("Journal", "http://purl.org/ontology/bibo/Journal");
		classLocalNameHash.put("Relationship", "http://vivoweb.org/ontology/core#Relationship");
		classLocalNameHash.put("Individual", "http://www.w3.org/2006/vcard/ns#Individual");
		classLocalNameHash.put("Chapter", "http://purl.org/ontology/bibo/Chapter");
		classLocalNameHash.put("BFO_0000038", "http://purl.obolibrary.org/obo/BFO_0000038");
		classLocalNameHash.put("AcademicDegree", "http://vivoweb.org/ontology/core#AcademicDegree");
		classLocalNameHash.put("Article", "http://purl.org/ontology/bibo/Article");
		classLocalNameHash.put("TimeZone", "http://www.w3.org/2006/vcard/ns#TimeZone");
		classLocalNameHash.put("geographical_region", "http://aims.fao.org/aos/geopolitical.owl#geographical_region");
		classLocalNameHash.put("Identification", "http://www.w3.org/2006/vcard/ns#Identification");
		classLocalNameHash.put("NonAcademicPosition", "http://vivoweb.org/ontology/core#NonAcademicPosition");
		classLocalNameHash.put("ResearcherRole", "http://vivoweb.org/ontology/core#ResearcherRole");
		classLocalNameHash.put("Explanatory", "http://www.w3.org/2006/vcard/ns#Explanatory");
		classLocalNameHash.put("Event", "http://purl.org/NET/c4dm/event.owl#Event");
		classLocalNameHash.put("Calendar", "http://www.w3.org/2006/vcard/ns#Calendar");
		classLocalNameHash.put("Security", "http://www.w3.org/2006/vcard/ns#Security");
		classLocalNameHash.put("AcademicArticle", "http://purl.org/ontology/bibo/AcademicArticle");
		classLocalNameHash.put("Country", "http://vivoweb.org/ontology/core#Country");
		classLocalNameHash.put("ConferencePoster", "http://vivoweb.org/ontology/core#ConferencePoster");
		classLocalNameHash.put("Person", "http://xmlns.com/foaf/0.1/Person");
		classLocalNameHash.put("BFO_0000002", "http://purl.obolibrary.org/obo/BFO_0000002");
		classLocalNameHash.put("BFO_0000015", "http://purl.obolibrary.org/obo/BFO_0000015");
		classLocalNameHash.put("BFO_0000031", "http://purl.obolibrary.org/obo/BFO_0000031");
		classLocalNameHash.put("Geo", "http://www.w3.org/2006/vcard/ns#Geo");
		classLocalNameHash.put("BFO_0000023", "http://purl.obolibrary.org/obo/BFO_0000023");
		classLocalNameHash.put("DateTimeInterval", "http://vivoweb.org/ontology/core#DateTimeInterval");
		classLocalNameHash.put("GovernmentAgency", "http://vivoweb.org/ontology/core#GovernmentAgency");
		classLocalNameHash.put("BFO_0000148", "http://purl.obolibrary.org/obo/BFO_0000148");
		classLocalNameHash.put("Document", "http://purl.org/ontology/bibo/Document");
		classLocalNameHash.put("IAO_0000009", "http://purl.obolibrary.org/obo/IAO_0000009");
		classLocalNameHash.put("Position", "http://vivoweb.org/ontology/core#Position");
		classLocalNameHash.put("PostdocPosition", "http://vivoweb.org/ontology/core#PostdocPosition");
		classLocalNameHash.put("Editorship", "http://vivoweb.org/ontology/core#Editorship");
		classLocalNameHash.put("Collection", "http://purl.org/ontology/bibo/Collection");
		classLocalNameHash.put("Work", "http://www.w3.org/2006/vcard/ns#Work");
		classLocalNameHash.put("Type", "http://www.w3.org/2006/vcard/ns#Type");
		classLocalNameHash.put("ARG_2000379", "http://purl.obolibrary.org/obo/ARG_2000379");
		classLocalNameHash.put("IAO_0000003", "http://purl.obolibrary.org/obo/IAO_0000003");
		classLocalNameHash.put("DateTimeValue", "http://vivoweb.org/ontology/core#DateTimeValue");
		classLocalNameHash.put("economic_region", "http://aims.fao.org/aos/geopolitical.owl#economic_region");
		classLocalNameHash.put("BFO_0000001", "http://purl.obolibrary.org/obo/BFO_0000001");
		classLocalNameHash.put("Kind", "http://www.w3.org/2006/vcard/ns#Kind");
		classLocalNameHash.put("BFO_0000017", "http://purl.obolibrary.org/obo/BFO_0000017");
		classLocalNameHash.put("territory", "http://aims.fao.org/aos/geopolitical.owl#territory");
		classLocalNameHash.put("Continent", "http://vivoweb.org/ontology/core#Continent");
		classLocalNameHash.put("Organizational", "http://www.w3.org/2006/vcard/ns#Organizational");
		classLocalNameHash.put("Agent", "http://xmlns.com/foaf/0.1/Agent");
		classLocalNameHash.put("BFO_0000141", "http://purl.obolibrary.org/obo/BFO_0000141");
		classLocalNameHash.put("Authorship", "http://vivoweb.org/ontology/core#Authorship");
		classLocalNameHash.put("NonFacultyAcademicPosition", "http://vivoweb.org/ontology/core#NonFacultyAcademicPosition");
		classLocalNameHash.put("DocumentStatus", "http://purl.org/ontology/bibo/DocumentStatus");
		classLocalNameHash.put("non_self_governing", "http://aims.fao.org/aos/geopolitical.owl#non_self_governing");
		classLocalNameHash.put("DocumentPart", "http://purl.org/ontology/bibo/DocumentPart");
		classLocalNameHash.put("Code", "http://www.w3.org/2006/vcard/ns#Code");
		classLocalNameHash.put("UO_0000280", "http://purl.obolibrary.org/obo/UO_0000280");
		classLocalNameHash.put("Addressing", "http://www.w3.org/2006/vcard/ns#Addressing");
		classLocalNameHash.put("BFO_0000008", "http://purl.obolibrary.org/obo/BFO_0000008");
		classLocalNameHash.put("Conference", "http://purl.org/ontology/bibo/Conference");
		classLocalNameHash.put("area", "http://aims.fao.org/aos/geopolitical.owl#area");
		classLocalNameHash.put("Title", "http://www.w3.org/2006/vcard/ns#Title");
		classLocalNameHash.put("Communication", "http://www.w3.org/2006/vcard/ns#Communication");
		classLocalNameHash.put("FacultyPosition", "http://vivoweb.org/ontology/core#FacultyPosition");
		classLocalNameHash.put("Company", "http://vivoweb.org/ontology/core#Company");
		classLocalNameHash.put("Publisher", "http://vivoweb.org/ontology/core#Publisher");
		classLocalNameHash.put("DateTimeValuePrecision", "http://vivoweb.org/ontology/core#DateTimeValuePrecision");
		classLocalNameHash.put("GeopoliticalEntity", "http://vivoweb.org/ontology/core#GeopoliticalEntity");
		classLocalNameHash.put("StateOrProvince", "http://vivoweb.org/ontology/core#StateOrProvince");
		classLocalNameHash.put("Name", "http://www.w3.org/2006/vcard/ns#Name");
		classLocalNameHash.put("Telephone", "http://www.w3.org/2006/vcard/ns#Telephone");
		classLocalNameHash.put("GeographicLocation", "http://vivoweb.org/ontology/core#GeographicLocation");
		classLocalNameHash.put("Periodical", "http://purl.org/ontology/bibo/Periodical");
		classLocalNameHash.put("Concept", "http://www.w3.org/2004/02/skos/core#Concept");
		classLocalNameHash.put("BookSection", "http://purl.org/ontology/bibo/BookSection");
		classLocalNameHash.put("BFO_0000004", "http://purl.obolibrary.org/obo/BFO_0000004");
		classLocalNameHash.put("BFO_0000020", "http://purl.obolibrary.org/obo/BFO_0000020");
		classLocalNameHash.put("IAO_0000030", "http://purl.obolibrary.org/obo/IAO_0000030");
		classLocalNameHash.put("GeographicRegion", "http://vivoweb.org/ontology/core#GeographicRegion");
		classLocalNameHash.put("Email", "http://www.w3.org/2006/vcard/ns#Email");
		classLocalNameHash.put("Slideshow", "http://purl.org/ontology/bibo/Slideshow");
		classLocalNameHash.put("FacultyAdministrativePosition", "http://vivoweb.org/ontology/core#FacultyAdministrativePosition");
		classLocalNameHash.put("Dataset", "http://vivoweb.org/ontology/core#Dataset");
		classLocalNameHash.put("Book", "http://purl.org/ontology/bibo/Book");
		classLocalNameHash.put("Report", "http://purl.org/ontology/bibo/Report");
		classLocalNameHash.put("Geographical", "http://www.w3.org/2006/vcard/ns#Geographical");
		classLocalNameHash.put("other", "http://aims.fao.org/aos/geopolitical.owl#other");
		classLocalNameHash.put("URL", "http://www.w3.org/2006/vcard/ns#URL");
		classLocalNameHash.put("ConferencePaper", "http://vivoweb.org/ontology/core#ConferencePaper");
		classLocalNameHash.put("PrimaryPosition", "http://vivoweb.org/ontology/core#PrimaryPosition");
		classLocalNameHash.put("Organization", "http://xmlns.com/foaf/0.1/Organization");
		classLocalNameHash.put("self_governing", "http://aims.fao.org/aos/geopolitical.owl#self_governing");
		classLocalNameHash.put("BFO_0000006", "http://purl.obolibrary.org/obo/BFO_0000006");
		classLocalNameHash.put("Thing", "http://www.w3.org/2002/07/owl#Thing");
		classLocalNameHash.put("AudioVisualDocument", "http://purl.org/ontology/bibo/AudioVisualDocument");
		classLocalNameHash.put("BFO_0000003", "http://purl.obolibrary.org/obo/BFO_0000003");
	}

	Dataset dataset = null;

	public ResultSet getResultSet(String queryString) {
		if (useSPARQL) {
			Query theClassQuery = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution theClassExecution = QueryExecutionFactory.sparqlService(endpoint, theClassQuery);
			return theClassExecution.execSelect();
		} else {
			dataset = TDBFactory.createDataset("/Users/eichmann/Documents/Components/openvivo");
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
