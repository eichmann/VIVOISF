package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(MapLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapLocatorIterator theMap = (MapLocatorIterator)findAncestorWithClass(this, MapLocatorIterator.class);
			pageContext.getOut().print(theMap.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for locator tag ");
		}
		return SKIP_BODY;
	}
}

