package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationAgriculturalAreaYearIterator theLocation = (LocationAgriculturalAreaYearIterator)findAncestorWithClass(this, LocationAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theLocation.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

