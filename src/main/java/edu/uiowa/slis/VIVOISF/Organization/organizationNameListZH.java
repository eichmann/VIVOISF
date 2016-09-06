package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListZHIterator theorganization = (organizationNameListZHIterator)findAncestorWithClass(this, organizationNameListZHIterator.class);
			pageContext.getOut().print(theorganization.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

