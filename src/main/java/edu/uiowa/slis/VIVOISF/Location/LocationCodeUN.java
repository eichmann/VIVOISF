package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeUNIterator theLocation = (LocationCodeUNIterator)findAncestorWithClass(this, LocationCodeUNIterator.class);
			pageContext.getOut().print(theLocation.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

