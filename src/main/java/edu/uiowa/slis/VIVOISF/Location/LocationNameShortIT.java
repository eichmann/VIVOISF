package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortITIterator theLocation = (LocationNameShortITIterator)findAncestorWithClass(this, LocationNameShortITIterator.class);
			pageContext.getOut().print(theLocation.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

