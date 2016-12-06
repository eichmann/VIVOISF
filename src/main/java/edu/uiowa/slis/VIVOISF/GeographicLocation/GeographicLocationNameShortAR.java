package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortARIterator theGeographicLocation = (GeographicLocationNameShortARIterator)findAncestorWithClass(this, GeographicLocationNameShortARIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

