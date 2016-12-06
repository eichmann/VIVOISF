package edu.uiowa.slis.VIVOISF.NonFacultyAcademicPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class NonFacultyAcademicPositionNameOfficialZHIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicPositionNameOfficialZHIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicPositionNameOfficialZHIterator.class);

	String subjectURI = null;
	String nameOfficialZH = null;
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

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://aims.fao.org/aos/geopolitical.owl#nameOfficialZH> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				nameOfficialZH = sol.get("?s").toString();
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
				nameOfficialZH = sol.get("?s").toString();
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

	public void setNameOfficialZH(String nameOfficialZH) {
		this.nameOfficialZH = nameOfficialZH;
	}

	public String getNameOfficialZH() {
		return nameOfficialZH;
	}

}
