package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeFAOSTATIterator theLocation = (LocationCodeFAOSTATIterator)findAncestorWithClass(this, LocationCodeFAOSTATIterator.class);
			pageContext.getOut().print(theLocation.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

