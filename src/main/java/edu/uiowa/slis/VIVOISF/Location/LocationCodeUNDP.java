package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationCodeUNDPIterator theLocation = (LocationCodeUNDPIterator)findAncestorWithClass(this, LocationCodeUNDPIterator.class);
			pageContext.getOut().print(theLocation.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

