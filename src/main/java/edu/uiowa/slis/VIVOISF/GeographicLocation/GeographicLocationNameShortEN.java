package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortENIterator theGeographicLocation = (GeographicLocationNameShortENIterator)findAncestorWithClass(this, GeographicLocationNameShortENIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

