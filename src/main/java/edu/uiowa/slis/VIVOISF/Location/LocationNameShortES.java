package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameShortESIterator theLocation = (LocationNameShortESIterator)findAncestorWithClass(this, LocationNameShortESIterator.class);
			pageContext.getOut().print(theLocation.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

