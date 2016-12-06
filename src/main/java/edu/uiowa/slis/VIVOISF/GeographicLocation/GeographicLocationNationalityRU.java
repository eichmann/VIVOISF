package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityRUIterator theGeographicLocation = (GeographicLocationNationalityRUIterator)findAncestorWithClass(this, GeographicLocationNationalityRUIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

