package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameOfficialFRIterator theGeographicLocation = (GeographicLocationNameOfficialFRIterator)findAncestorWithClass(this, GeographicLocationNameOfficialFRIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

