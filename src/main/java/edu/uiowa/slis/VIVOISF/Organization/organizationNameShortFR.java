package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationNameShortFRIterator theorganization = (organizationNameShortFRIterator)findAncestorWithClass(this, organizationNameShortFRIterator.class);
			pageContext.getOut().print(theorganization.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

