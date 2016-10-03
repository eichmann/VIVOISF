package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapPageEndIterator theMap = (MapPageEndIterator)findAncestorWithClass(this, MapPageEndIterator.class);
			pageContext.getOut().print(theMap.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

