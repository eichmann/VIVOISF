package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameShortRUIterator theGeographicLocation = (GeographicLocationNameShortRUIterator)findAncestorWithClass(this, GeographicLocationNameShortRUIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

