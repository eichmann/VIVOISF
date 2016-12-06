package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameListRUIterator theGeographicLocation = (GeographicLocationNameListRUIterator)findAncestorWithClass(this, GeographicLocationNameListRUIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

