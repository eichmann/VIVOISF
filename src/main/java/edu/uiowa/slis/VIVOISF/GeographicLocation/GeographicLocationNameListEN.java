package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListENIterator theGeographicLocation = (GeographicLocationNameListENIterator)findAncestorWithClass(this, GeographicLocationNameListENIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

