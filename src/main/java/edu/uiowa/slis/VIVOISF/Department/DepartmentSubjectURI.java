package edu.uiowa.slis.VIVOISF.Department;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DepartmentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DepartmentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DepartmentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			if (!theDepartment.commitNeeded) {
				pageContext.getOut().print(theDepartment.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Department for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			return theDepartment.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Department for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Department theDepartment = (Department)findAncestorWithClass(this, Department.class);
			theDepartment.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Department for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Department for subjectURI tag ");
		}
	}
}

