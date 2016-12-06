package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortFRIterator theGeographicLocation = (GeographicLocationNameShortFRIterator)findAncestorWithClass(this, GeographicLocationNameShortFRIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

