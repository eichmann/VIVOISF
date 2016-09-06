package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationDoiIterator theLocation = (LocationDoiIterator)findAncestorWithClass(this, LocationDoiIterator.class);
			pageContext.getOut().print(theLocation.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for doi tag ");
		}
		return SKIP_BODY;
	}
}

