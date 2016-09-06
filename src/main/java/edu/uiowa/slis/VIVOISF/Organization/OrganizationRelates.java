package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRelatesIterator theOrganizationRelatesIterator = (OrganizationRelatesIterator)findAncestorWithClass(this, OrganizationRelatesIterator.class);
			pageContext.getOut().print(theOrganizationRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for relates tag ");
		}
		return SKIP_BODY;
	}
}

