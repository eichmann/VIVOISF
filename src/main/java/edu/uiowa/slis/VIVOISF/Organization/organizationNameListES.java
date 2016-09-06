package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListESIterator theorganization = (organizationNameListESIterator)findAncestorWithClass(this, organizationNameListESIterator.class);
			pageContext.getOut().print(theorganization.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

