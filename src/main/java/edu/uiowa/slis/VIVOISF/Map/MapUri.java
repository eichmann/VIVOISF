package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapUri currentInstance = null;
	private static final Log log = LogFactory.getLog(MapUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapUriIterator theMap = (MapUriIterator)findAncestorWithClass(this, MapUriIterator.class);
			pageContext.getOut().print(theMap.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for uri tag ");
		}
		return SKIP_BODY;
	}
}

