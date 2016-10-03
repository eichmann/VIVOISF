package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(MapCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapCodenIterator theMap = (MapCodenIterator)findAncestorWithClass(this, MapCodenIterator.class);
			pageContext.getOut().print(theMap.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for coden tag ");
		}
		return SKIP_BODY;
	}
}

