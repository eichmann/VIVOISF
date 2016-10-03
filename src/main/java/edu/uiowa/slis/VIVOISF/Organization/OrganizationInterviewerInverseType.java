package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationInterviewerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationInterviewerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationInterviewerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationInterviewerInverseIterator theOrganizationInterviewerInverseIterator = (OrganizationInterviewerInverseIterator)findAncestorWithClass(this, OrganizationInterviewerInverseIterator.class);
			pageContext.getOut().print(theOrganizationInterviewerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

