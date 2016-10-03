package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapContent currentInstance = null;
	private static final Log log = LogFactory.getLog(MapContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapContentIterator theMap = (MapContentIterator)findAncestorWithClass(this, MapContentIterator.class);
			pageContext.getOut().print(theMap.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for content tag ");
		}
		return SKIP_BODY;
	}
}

