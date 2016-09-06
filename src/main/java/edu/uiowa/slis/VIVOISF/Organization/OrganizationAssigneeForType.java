package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAssigneeForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAssigneeForType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAssigneeForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationAssigneeForIterator theOrganizationAssigneeForIterator = (OrganizationAssigneeForIterator)findAncestorWithClass(this, OrganizationAssigneeForIterator.class);
			pageContext.getOut().print(theOrganizationAssigneeForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for assigneeFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for assigneeFor tag ");
		}
		return SKIP_BODY;
	}
}

