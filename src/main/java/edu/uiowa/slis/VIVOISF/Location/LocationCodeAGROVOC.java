package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeAGROVOCIterator theLocation = (LocationCodeAGROVOCIterator)findAncestorWithClass(this, LocationCodeAGROVOCIterator.class);
			pageContext.getOut().print(theLocation.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

