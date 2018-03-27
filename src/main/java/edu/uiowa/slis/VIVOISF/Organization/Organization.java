package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Organization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Organization currentInstance = null;
	private static final Log log = LogFactory.getLog(Organization.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String abbreviation = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OrganizationIterator theOrganizationIterator = (OrganizationIterator) findAncestorWithClass(this, OrganizationIterator.class);

			if (theOrganizationIterator != null) {
				subjectURI = theOrganizationIterator.getSubjectURI();
				label = theOrganizationIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Collection.CollectionPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Collection.CollectionPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BookSection.BookSectionPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BookSection.BookSectionPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator)this.getParent()).getPublisher();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartPublisherIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartPublisherIterator)this.getParent()).getPublisher();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator theBFO_0000001RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatesIterator.class);

			if (subjectURI == null && theBFO_0000001RelatesIterator != null) {
				subjectURI = theBFO_0000001RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator theBFO_0000002RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatesIterator.class);

			if (subjectURI == null && theBFO_0000002RelatesIterator != null) {
				subjectURI = theBFO_0000002RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator theThingRelatesIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatesIterator.class);

			if (subjectURI == null && theThingRelatesIterator != null) {
				subjectURI = theThingRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator theBFO_0000020RelatesIterator = (edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000020.BFO_0000020RelatesIterator.class);

			if (subjectURI == null && theBFO_0000020RelatesIterator != null) {
				subjectURI = theBFO_0000020RelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator theRelationshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Relationship.RelationshipRelatesIterator.class);

			if (subjectURI == null && theRelationshipRelatesIterator != null) {
				subjectURI = theRelationshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator thePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Position.PositionRelatesIterator.class);

			if (subjectURI == null && thePositionRelatesIterator != null) {
				subjectURI = thePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonAcademicPositionRelatesIterator != null) {
				subjectURI = theNonAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionRelatesIterator != null) {
				subjectURI = theFacultyAdministrativePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator theNonFacultyAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition.NonFacultyAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonFacultyAcademicPositionRelatesIterator != null) {
				subjectURI = theNonFacultyAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator.class);

			if (subjectURI == null && thePrimaryPositionRelatesIterator != null) {
				subjectURI = thePrimaryPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator.class);

			if (subjectURI == null && thePostdocPositionRelatesIterator != null) {
				subjectURI = thePostdocPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublisherIterator theBFO_0000001PublisherIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001PublisherIterator.class);

			if (subjectURI == null && theBFO_0000001PublisherIterator != null) {
				subjectURI = theBFO_0000001PublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublisherIterator theBFO_0000002PublisherIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002PublisherIterator.class);

			if (subjectURI == null && theBFO_0000002PublisherIterator != null) {
				subjectURI = theBFO_0000002PublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublisherIterator theBFO_0000031PublisherIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031PublisherIterator.class);

			if (subjectURI == null && theBFO_0000031PublisherIterator != null) {
				subjectURI = theBFO_0000031PublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublisherIterator theIAO_0000030PublisherIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030PublisherIterator.class);

			if (subjectURI == null && theIAO_0000030PublisherIterator != null) {
				subjectURI = theIAO_0000030PublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingPublisherIterator theThingPublisherIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingPublisherIterator.class);

			if (subjectURI == null && theThingPublisherIterator != null) {
				subjectURI = theThingPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentPublisherIterator theDocumentPublisherIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentPublisherIterator.class);

			if (subjectURI == null && theDocumentPublisherIterator != null) {
				subjectURI = theDocumentPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator theBookPublisherIterator = (edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookPublisherIterator.class);

			if (subjectURI == null && theBookPublisherIterator != null) {
				subjectURI = theBookPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Collection.CollectionPublisherIterator theCollectionPublisherIterator = (edu.uiowa.slis.VIVOISF.Collection.CollectionPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Collection.CollectionPublisherIterator.class);

			if (subjectURI == null && theCollectionPublisherIterator != null) {
				subjectURI = theCollectionPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator theJournalPublisherIterator = (edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Journal.JournalPublisherIterator.class);

			if (subjectURI == null && theJournalPublisherIterator != null) {
				subjectURI = theJournalPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublisherIterator thePeriodicalPublisherIterator = (edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Periodical.PeriodicalPublisherIterator.class);

			if (subjectURI == null && thePeriodicalPublisherIterator != null) {
				subjectURI = thePeriodicalPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.BookSection.BookSectionPublisherIterator theBookSectionPublisherIterator = (edu.uiowa.slis.VIVOISF.BookSection.BookSectionPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BookSection.BookSectionPublisherIterator.class);

			if (subjectURI == null && theBookSectionPublisherIterator != null) {
				subjectURI = theBookSectionPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator theChapterPublisherIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterPublisherIterator.class);

			if (subjectURI == null && theChapterPublisherIterator != null) {
				subjectURI = theChapterPublisherIterator.getPublisher();
			}

			edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartPublisherIterator theDocumentPartPublisherIterator = (edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartPublisherIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.DocumentPart.DocumentPartPublisherIterator.class);

			if (subjectURI == null && theDocumentPartPublisherIterator != null) {
				subjectURI = theDocumentPartPublisherIterator.getPublisher();
			}

			if (theOrganizationIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?Abbreviation where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#abbreviation> ?Abbreviation } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					abbreviation = sol.get("?Abbreviation") == null ? null : sol.get("?Abbreviation").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Organization doStartTag", e);
			throw new JspTagException("Exception raised in Organization doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Organization doEndTag", e);
			throw new JspTagException("Exception raised in Organization doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String theLabel) {
		label = theLabel;
	}

	public String getLabel() {
		return label;
	}

	public void setAbbreviation(String theAbbreviation) {
		abbreviation = theAbbreviation;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
