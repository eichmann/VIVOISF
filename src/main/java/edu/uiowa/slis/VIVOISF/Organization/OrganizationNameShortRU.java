package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortRUIterator theOrganization = (OrganizationNameShortRUIterator)findAncestorWithClass(this, OrganizationNameShortRUIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

