package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityFRIterator theGeographicLocation = (GeographicLocationNationalityFRIterator)findAncestorWithClass(this, GeographicLocationNationalityFRIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

