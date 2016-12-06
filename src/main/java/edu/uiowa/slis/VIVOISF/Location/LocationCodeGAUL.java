package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeGAULIterator theLocation = (LocationCodeGAULIterator)findAncestorWithClass(this, LocationCodeGAULIterator.class);
			pageContext.getOut().print(theLocation.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

