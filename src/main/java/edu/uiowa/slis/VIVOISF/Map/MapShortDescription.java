package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(MapShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapShortDescriptionIterator theMap = (MapShortDescriptionIterator)findAncestorWithClass(this, MapShortDescriptionIterator.class);
			pageContext.getOut().print(theMap.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}
