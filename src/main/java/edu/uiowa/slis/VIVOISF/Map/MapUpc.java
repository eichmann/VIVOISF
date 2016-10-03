package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(MapUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapUpcIterator theMap = (MapUpcIterator)findAncestorWithClass(this, MapUpcIterator.class);
			pageContext.getOut().print(theMap.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for upc tag ");
		}
		return SKIP_BODY;
	}
}
