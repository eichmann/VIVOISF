package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameOfficialRUIterator theorganization = (organizationNameOfficialRUIterator)findAncestorWithClass(this, organizationNameOfficialRUIterator.class);
			pageContext.getOut().print(theorganization.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

