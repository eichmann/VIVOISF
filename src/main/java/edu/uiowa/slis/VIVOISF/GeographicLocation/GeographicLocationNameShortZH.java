package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortZHIterator theGeographicLocation = (GeographicLocationNameShortZHIterator)findAncestorWithClass(this, GeographicLocationNameShortZHIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

