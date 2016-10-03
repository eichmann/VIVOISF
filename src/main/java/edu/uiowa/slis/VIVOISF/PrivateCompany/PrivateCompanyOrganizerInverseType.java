package edu.uiowa.slis.VIVOISF.PrivateCompany;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrivateCompanyOrganizerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PrivateCompanyOrganizerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrivateCompanyOrganizerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrivateCompanyOrganizerInverseIterator thePrivateCompanyOrganizerInverseIterator = (PrivateCompanyOrganizerInverseIterator)findAncestorWithClass(this, PrivateCompanyOrganizerInverseIterator.class);
			pageContext.getOut().print(thePrivateCompanyOrganizerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PrivateCompany for organizer tag ", e);
			throw new JspTagException("Error: Can't find enclosing PrivateCompany for organizer tag ");
		}
		return SKIP_BODY;
	}
}

