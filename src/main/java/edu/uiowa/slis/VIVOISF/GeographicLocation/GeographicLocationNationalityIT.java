package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityITIterator theGeographicLocation = (GeographicLocationNationalityITIterator)findAncestorWithClass(this, GeographicLocationNationalityITIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

