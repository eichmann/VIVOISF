package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityARIterator theGeographicLocation = (GeographicLocationNationalityARIterator)findAncestorWithClass(this, GeographicLocationNationalityARIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

