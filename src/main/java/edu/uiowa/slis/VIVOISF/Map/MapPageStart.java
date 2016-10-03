package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapPageStartIterator theMap = (MapPageStartIterator)findAncestorWithClass(this, MapPageStartIterator.class);
			pageContext.getOut().print(theMap.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

