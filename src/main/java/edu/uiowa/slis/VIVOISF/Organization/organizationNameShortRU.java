package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameShortRUIterator theorganization = (organizationNameShortRUIterator)findAncestorWithClass(this, organizationNameShortRUIterator.class);
			pageContext.getOut().print(theorganization.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

