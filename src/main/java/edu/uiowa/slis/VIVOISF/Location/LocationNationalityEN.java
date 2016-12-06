package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNationalityENIterator theLocation = (LocationNationalityENIterator)findAncestorWithClass(this, LocationNationalityENIterator.class);
			pageContext.getOut().print(theLocation.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

