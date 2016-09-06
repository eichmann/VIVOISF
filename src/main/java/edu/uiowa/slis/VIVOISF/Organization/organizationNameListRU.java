package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListRUIterator theorganization = (organizationNameListRUIterator)findAncestorWithClass(this, organizationNameListRUIterator.class);
			pageContext.getOut().print(theorganization.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

