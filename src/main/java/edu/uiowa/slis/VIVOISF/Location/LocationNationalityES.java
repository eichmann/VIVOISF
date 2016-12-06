package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityESIterator theLocation = (LocationNationalityESIterator)findAncestorWithClass(this, LocationNationalityESIterator.class);
			pageContext.getOut().print(theLocation.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

