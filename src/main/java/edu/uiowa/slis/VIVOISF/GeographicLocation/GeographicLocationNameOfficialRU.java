package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialRUIterator theGeographicLocation = (GeographicLocationNameOfficialRUIterator)findAncestorWithClass(this, GeographicLocationNameOfficialRUIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

