package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumAffiliatedOrganizationIterator theMuseumAffiliatedOrganizationIterator = (MuseumAffiliatedOrganizationIterator)findAncestorWithClass(this, MuseumAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theMuseumAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

