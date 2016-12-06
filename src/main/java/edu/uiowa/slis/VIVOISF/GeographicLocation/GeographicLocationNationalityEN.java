package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNationalityENIterator theGeographicLocation = (GeographicLocationNationalityENIterator)findAncestorWithClass(this, GeographicLocationNationalityENIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

