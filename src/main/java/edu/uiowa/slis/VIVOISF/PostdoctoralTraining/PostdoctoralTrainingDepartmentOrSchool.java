package edu.uiowa.slis.VIVOISF.PostdoctoralTraining;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdoctoralTrainingDepartmentOrSchool extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdoctoralTrainingDepartmentOrSchool currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdoctoralTrainingDepartmentOrSchool.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdoctoralTrainingDepartmentOrSchoolIterator thePostdoctoralTraining = (PostdoctoralTrainingDepartmentOrSchoolIterator)findAncestorWithClass(this, PostdoctoralTrainingDepartmentOrSchoolIterator.class);
			pageContext.getOut().print(thePostdoctoralTraining.getDepartmentOrSchool());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdoctoralTraining for departmentOrSchool tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdoctoralTraining for departmentOrSchool tag ");
		}
		return SKIP_BODY;
	}
}

