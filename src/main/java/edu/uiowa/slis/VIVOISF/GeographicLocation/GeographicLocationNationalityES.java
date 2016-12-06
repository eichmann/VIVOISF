package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityESIterator theGeographicLocation = (GeographicLocationNationalityESIterator)findAncestorWithClass(this, GeographicLocationNationalityESIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

