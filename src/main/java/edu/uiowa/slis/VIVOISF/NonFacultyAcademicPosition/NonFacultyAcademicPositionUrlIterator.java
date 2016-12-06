package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionUrlIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionUrlIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionUrlIterator.class);

	String subjectURI = null;
	String url = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			NonFacultyAcademicPosition ancestorInstance = (NonFacultyAcademicPosition) findAncestorWithClass(this, NonFacultyAcademicPosition.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://www.w3.org/2006/vcard/ns#url> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				url = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademicPositionIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonFacultyAcademicPositionIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				url = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademicPositionIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in NonFacultyAcademicPositionIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in NonFacultyAcademicPosition doEndTag", e);
			throw new JspTagException("Exception raised in NonFacultyAcademicPosition doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

}
