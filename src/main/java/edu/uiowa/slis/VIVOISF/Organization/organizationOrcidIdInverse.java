package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationOrcidIdInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationOrcidIdInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationOrcidIdInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationOrcidIdInverseIterator theorganizationOrcidIdInverseIterator = (organizationOrcidIdInverseIterator)findAncestorWithClass(this, organizationOrcidIdInverseIterator.class);
			pageContext.getOut().print(theorganizationOrcidIdInverseIterator.getOrcidIdInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

