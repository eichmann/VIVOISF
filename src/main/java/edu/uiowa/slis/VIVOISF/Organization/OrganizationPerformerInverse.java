package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationPerformerInverseIterator theOrganizationPerformerInverseIterator = (OrganizationPerformerInverseIterator)findAncestorWithClass(this, OrganizationPerformerInverseIterator.class);
			pageContext.getOut().print(theOrganizationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for performer tag ");
		}
		return SKIP_BODY;
	}
}

