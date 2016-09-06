package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameListFRIterator theorganization = (organizationNameListFRIterator)findAncestorWithClass(this, organizationNameListFRIterator.class);
			pageContext.getOut().print(theorganization.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

