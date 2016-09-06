package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionAffiliatedOrganizationIterator theDivisionAffiliatedOrganizationIterator = (DivisionAffiliatedOrganizationIterator)findAncestorWithClass(this, DivisionAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theDivisionAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

