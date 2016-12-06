package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityITIterator theLocation = (LocationNationalityITIterator)findAncestorWithClass(this, LocationNationalityITIterator.class);
			pageContext.getOut().print(theLocation.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

