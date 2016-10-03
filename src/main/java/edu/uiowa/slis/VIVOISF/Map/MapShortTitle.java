package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MapShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapShortTitleIterator theMap = (MapShortTitleIterator)findAncestorWithClass(this, MapShortTitleIterator.class);
			pageContext.getOut().print(theMap.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

