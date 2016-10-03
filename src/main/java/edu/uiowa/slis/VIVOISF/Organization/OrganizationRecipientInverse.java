package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRecipientInverseIterator theOrganizationRecipientInverseIterator = (OrganizationRecipientInverseIterator)findAncestorWithClass(this, OrganizationRecipientInverseIterator.class);
			pageContext.getOut().print(theOrganizationRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for recipient tag ");
		}
		return SKIP_BODY;
	}
}

