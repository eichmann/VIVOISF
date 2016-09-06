package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapPmidIterator theMap = (MapPmidIterator)findAncestorWithClass(this, MapPmidIterator.class);
			pageContext.getOut().print(theMap.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for pmid tag ");
		}
		return SKIP_BODY;
	}
}

