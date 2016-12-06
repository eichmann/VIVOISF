package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityFRIterator theLocation = (LocationNationalityFRIterator)findAncestorWithClass(this, LocationNationalityFRIterator.class);
			pageContext.getOut().print(theLocation.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

