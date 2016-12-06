package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityARIterator theLocation = (LocationNationalityARIterator)findAncestorWithClass(this, LocationNationalityARIterator.class);
			pageContext.getOut().print(theLocation.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

