package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(MapDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapDoiIterator theMap = (MapDoiIterator)findAncestorWithClass(this, MapDoiIterator.class);
			pageContext.getOut().print(theMap.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for doi tag ");
		}
		return SKIP_BODY;
	}
}

