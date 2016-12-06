package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialENIterator theGeographicLocation = (GeographicLocationNameOfficialENIterator)findAncestorWithClass(this, GeographicLocationNameOfficialENIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

