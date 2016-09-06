package edu.uiowa.slis.VIVOISF.Chapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Chapter extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Chapter currentInstance = null;
	private static final Log log = LogFactory.getLog(Chapter.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String placeOfPublication = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ChapterIterator theChapterIterator = (ChapterIterator) findAncestorWithClass(this, ChapterIterator.class);

			if (theChapterIterator != null) {
				subjectURI = theChapterIterator.getSubjectURI();
				label = theChapterIterator.getLabel();
			}

			if (theChapterIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(Prefix_1_4
				+ " SELECT ?label  ?placeOfPublication where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://vivoweb.org/ontology/core#placeOfPublication> ?placeOfPublication } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").toString();
					placeOfPublication = sol.get("?placeOfPublication") == null ? null : sol.get("?placeOfPublication").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Chapter doStartTag", e);
			throw new JspTagException("Exception raised in Chapter doStartTag");
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
			log.error("Exception raised in Chapter doEndTag", e);
			throw new JspTagException("Exception raised in Chapter doEndTag");
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

	public void setPlaceOfPublication(String placeOfPublication) {
		this.placeOfPublication = placeOfPublication;
	}

	public String getPlaceOfPublication() {
		return placeOfPublication;
	}

}
