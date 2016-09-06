package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListARIterator theorganization = (organizationNameListARIterator)findAncestorWithClass(this, organizationNameListARIterator.class);
			pageContext.getOut().print(theorganization.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

