package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameListITIterator theLocation = (LocationNameListITIterator)findAncestorWithClass(this, LocationNameListITIterator.class);
			pageContext.getOut().print(theLocation.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

