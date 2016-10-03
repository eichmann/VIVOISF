package edu.uiowa.slis.VIVOISF.Company;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompanyOrganizerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompanyOrganizerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CompanyOrganizerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompanyOrganizerInverseIterator theCompanyOrganizerInverseIterator = (CompanyOrganizerInverseIterator)findAncestorWithClass(this, CompanyOrganizerInverseIterator.class);
			pageContext.getOut().print(theCompanyOrganizerInverseIterator.getOrganizerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Company for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Company for organizer tag ");
		}
		return SKIP_BODY;
	}
}

