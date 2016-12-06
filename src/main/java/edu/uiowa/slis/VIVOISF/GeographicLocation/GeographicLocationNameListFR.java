package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListFRIterator theGeographicLocation = (GeographicLocationNameListFRIterator)findAncestorWithClass(this, GeographicLocationNameListFRIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

