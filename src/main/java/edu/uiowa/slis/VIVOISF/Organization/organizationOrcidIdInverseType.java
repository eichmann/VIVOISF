package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			organizationOrcidIdInverseIterator theorganizationOrcidIdInverseIterator = (organizationOrcidIdInverseIterator)findAncestorWithClass(this, organizationOrcidIdInverseIterator.class);
			pageContext.getOut().print(theorganizationOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

