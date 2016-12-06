package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListESIterator theGeographicLocation = (GeographicLocationNameListESIterator)findAncestorWithClass(this, GeographicLocationNameListESIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

