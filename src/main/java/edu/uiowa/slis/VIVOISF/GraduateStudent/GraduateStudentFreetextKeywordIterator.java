package edu.uiowa.slis.VIVOISF.GraduateStudent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GraduateStudentFreetextKeywordIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GraduateStudentFreetextKeywordIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GraduateStudentFreetextKeywordIterator.class);

	String subjectURI = null;
	String freetextKeyword = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GraduateStudent ancestorInstance = (GraduateStudent) findAncestorWithClass(this, GraduateStudent.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#freetextKeyword> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				freetextKeyword = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudentIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GraduateStudentIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				freetextKeyword = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudentIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GraduateStudentIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GraduateStudent doEndTag", e);
			throw new JspTagException("Exception raised in GraduateStudent doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setFreetextKeyword(String freetextKeyword) {
		this.freetextKeyword = freetextKeyword;
	}

	public String getFreetextKeyword() {
		return freetextKeyword;
	}

}
