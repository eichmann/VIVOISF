package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapPages currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapPagesIterator theMap = (MapPagesIterator)findAncestorWithClass(this, MapPagesIterator.class);
			pageContext.getOut().print(theMap.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for pages tag ");
		}
		return SKIP_BODY;
	}
}

