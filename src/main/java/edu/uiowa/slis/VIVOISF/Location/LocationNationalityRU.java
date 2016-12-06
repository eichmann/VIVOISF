package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityRUIterator theLocation = (LocationNationalityRUIterator)findAncestorWithClass(this, LocationNationalityRUIterator.class);
			pageContext.getOut().print(theLocation.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

