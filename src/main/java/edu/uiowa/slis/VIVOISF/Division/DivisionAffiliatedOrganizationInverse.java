package edu.uiowa.slis.VIVOISF.Division;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DivisionAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DivisionAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DivisionAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DivisionAffiliatedOrganizationInverseIterator theDivisionAffiliatedOrganizationInverseIterator = (DivisionAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, DivisionAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theDivisionAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Division for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Division for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

