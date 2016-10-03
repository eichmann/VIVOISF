package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(MapNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapNumPagesIterator theMap = (MapNumPagesIterator)findAncestorWithClass(this, MapNumPagesIterator.class);
			pageContext.getOut().print(theMap.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for numPages tag ");
		}
		return SKIP_BODY;
	}
}

