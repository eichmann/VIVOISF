package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasEmailIterator theOrganizationHasEmailIterator = (OrganizationHasEmailIterator)findAncestorWithClass(this, OrganizationHasEmailIterator.class);
			pageContext.getOut().print(theOrganizationHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

