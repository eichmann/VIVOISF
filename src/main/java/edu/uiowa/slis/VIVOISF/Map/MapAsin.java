package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(MapAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapAsinIterator theMap = (MapAsinIterator)findAncestorWithClass(this, MapAsinIterator.class);
			pageContext.getOut().print(theMap.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for asin tag ");
		}
		return SKIP_BODY;
	}
}

