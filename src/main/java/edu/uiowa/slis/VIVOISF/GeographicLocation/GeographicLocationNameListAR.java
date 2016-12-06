package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListARIterator theGeographicLocation = (GeographicLocationNameListARIterator)findAncestorWithClass(this, GeographicLocationNameListARIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

