package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Person extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Person currentInstance = null;
	private static final Log log = LogFactory.getLog(Person.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String teachingOverview = null;
	String outreachOverview = null;
	String researchOverview = null;
	String overview = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PersonIterator thePersonIterator = (PersonIterator) findAncestorWithClass(this, PersonIterator.class);

			if (thePersonIterator != null) {
				subjectURI = thePersonIterator.getSubjectURI();
				label = thePersonIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator)this.getParent()).getARG_2000029();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator)this.getParent()).getERO_0000390();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator)this.getParent()).getERO_0000398();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator)this.getParent()).getRelates();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000033InverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000033InverseIterator)this.getParent()).getERO_0000033Inverse();
			}

			edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator theARG_2000379ARG_2000029Iterator = (edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ARG_2000379.ARG_2000379ARG_2000029Iterator.class);

			if (subjectURI == null && theARG_2000379ARG_2000029Iterator != null) {
				subjectURI = theARG_2000379ARG_2000029Iterator.getARG_2000029();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator theERO_0000005ERO_0000390Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000005.ERO_0000005ERO_0000390Iterator.class);

			if (subjectURI == null && theERO_0000005ERO_0000390Iterator != null) {
				subjectURI = theERO_0000005ERO_0000390Iterator.getERO_0000390();
			}

			edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator theERO_0000007ERO_0000398Iterator = (edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ERO_0000007.ERO_0000007ERO_0000398Iterator.class);

			if (subjectURI == null && theERO_0000007ERO_0000398Iterator != null) {
				subjectURI = theERO_0000007ERO_0000398Iterator.getERO_0000398();
			}

			edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator theLibrarianPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.LibrarianPosition.LibrarianPositionRelatesIterator.class);

			if (subjectURI == null && theLibrarianPositionRelatesIterator != null) {
				subjectURI = theLibrarianPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator theChapterRelatesIterator = (edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Chapter.ChapterRelatesIterator.class);

			if (subjectURI == null && theChapterRelatesIterator != null) {
				subjectURI = theChapterRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator theNonAcademicPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.NonAcademicPosition.NonAcademicPositionRelatesIterator.class);

			if (subjectURI == null && theNonAcademicPositionRelatesIterator != null) {
				subjectURI = theNonAcademicPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator thePostdocPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PostdocPosition.PostdocPositionRelatesIterator.class);

			if (subjectURI == null && thePostdocPositionRelatesIterator != null) {
				subjectURI = thePostdocPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator theEditorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Editorship.EditorshipRelatesIterator.class);

			if (subjectURI == null && theEditorshipRelatesIterator != null) {
				subjectURI = theEditorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator theAuthorshipRelatesIterator = (edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Authorship.AuthorshipRelatesIterator.class);

			if (subjectURI == null && theAuthorshipRelatesIterator != null) {
				subjectURI = theAuthorshipRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator theFacultyPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyPosition.FacultyPositionRelatesIterator.class);

			if (subjectURI == null && theFacultyPositionRelatesIterator != null) {
				subjectURI = theFacultyPositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator theFacultyAdministrativePositionRelatesIterator = (edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.FacultyAdministrativePosition.FacultyAdministrativePositionRelatesIterator.class);

			if (subjectURI == null && theFacultyAdministrativePositionRelatesIterator != null) {
				subjectURI = theFacultyAdministrativePositionRelatesIterator.getRelates();
			}

			edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator thePrimaryPositionRelatesIterator = (edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.PrimaryPosition.PrimaryPositionRelatesIterator.class);

			if (subjectURI == null && thePrimaryPositionRelatesIterator != null) {
				subjectURI = thePrimaryPositionRelatesIterator.getRelates();
			}

			if (thePersonIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  ?teachingOverview ?outreachOverview ?researchOverview ?overview where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#teachingOverview> ?teachingOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#outreachOverview> ?outreachOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#researchOverview> ?researchOverview } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#overview> ?overview } "
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
					teachingOverview = sol.get("?teachingOverview") == null ? null : sol.get("?teachingOverview").toString();
					outreachOverview = sol.get("?outreachOverview") == null ? null : sol.get("?outreachOverview").toString();
					researchOverview = sol.get("?researchOverview") == null ? null : sol.get("?researchOverview").toString();
					overview = sol.get("?overview") == null ? null : sol.get("?overview").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Person doStartTag", e);
			throw new JspTagException("Exception raised in Person doStartTag");
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
			log.error("Exception raised in Person doEndTag", e);
			throw new JspTagException("Exception raised in Person doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setTeachingOverview(String teachingOverview) {
		this.teachingOverview = teachingOverview;
	}

	public String getTeachingOverview() {
		return teachingOverview;
	}

	public void setOutreachOverview(String outreachOverview) {
		this.outreachOverview = outreachOverview;
	}

	public String getOutreachOverview() {
		return outreachOverview;
	}

	public void setResearchOverview(String researchOverview) {
		this.researchOverview = researchOverview;
	}

	public String getResearchOverview() {
		return researchOverview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getOverview() {
		return overview;
	}

}
