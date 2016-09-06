package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationAffiliatedOrganizationIterator theFoundationAffiliatedOrganizationIterator = (FoundationAffiliatedOrganizationIterator)findAncestorWithClass(this, FoundationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theFoundationAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

