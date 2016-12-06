package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListZHIterator theGeographicLocation = (GeographicLocationNameListZHIterator)findAncestorWithClass(this, GeographicLocationNameListZHIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

