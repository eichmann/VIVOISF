package edu.uiowa.slis.VIVOISF.MedicalResidency;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class MedicalResidencyDepartmentOrSchoolIterator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MedicalResidencyDepartmentOrSchoolIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(MedicalResidencyDepartmentOrSchoolIterator.class);

	String subjectURI = null;
	String departmentOrSchool = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			MedicalResidency ancestorInstance = (MedicalResidency) findAncestorWithClass(this, MedicalResidency.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://vivoweb.org/ontology/core#departmentOrSchool> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				departmentOrSchool = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in MedicalResidencyIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MedicalResidencyIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				departmentOrSchool = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in MedicalResidencyIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in MedicalResidencyIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in MedicalResidency doEndTag", e);
			throw new JspTagException("Exception raised in MedicalResidency doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setDepartmentOrSchool(String departmentOrSchool) {
		this.departmentOrSchool = departmentOrSchool;
	}

	public String getDepartmentOrSchool() {
		return departmentOrSchool;
	}

}
