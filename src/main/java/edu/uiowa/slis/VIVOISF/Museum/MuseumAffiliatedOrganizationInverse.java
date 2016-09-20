package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumAffiliatedOrganizationInverseIterator theMuseumAffiliatedOrganizationInverseIterator = (MuseumAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, MuseumAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theMuseumAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

