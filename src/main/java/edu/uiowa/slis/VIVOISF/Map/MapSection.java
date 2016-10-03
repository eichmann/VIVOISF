package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapSection currentInstance = null;
	private static final Log log = LogFactory.getLog(MapSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapSectionIterator theMap = (MapSectionIterator)findAncestorWithClass(this, MapSectionIterator.class);
			pageContext.getOut().print(theMap.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for section tag ");
		}
		return SKIP_BODY;
	}
}

