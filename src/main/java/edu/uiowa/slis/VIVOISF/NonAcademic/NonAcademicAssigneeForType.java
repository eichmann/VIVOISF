package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicAssigneeForIterator theNonAcademicAssigneeForIterator = (NonAcademicAssigneeForIterator)findAncestorWithClass(this, NonAcademicAssigneeForIterator.class);
			pageContext.getOut().print(theNonAcademicAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

