package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationTheAbstractIterator theLocation = (LocationTheAbstractIterator)findAncestorWithClass(this, LocationTheAbstractIterator.class);
			pageContext.getOut().print(theLocation.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

