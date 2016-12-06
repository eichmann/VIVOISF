package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListITIterator theGeographicLocation = (GeographicLocationNameListITIterator)findAncestorWithClass(this, GeographicLocationNameListITIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

