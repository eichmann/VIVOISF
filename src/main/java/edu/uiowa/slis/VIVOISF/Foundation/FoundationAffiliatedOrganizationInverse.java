package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationAffiliatedOrganizationInverseIterator theFoundationAffiliatedOrganizationInverseIterator = (FoundationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, FoundationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theFoundationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

