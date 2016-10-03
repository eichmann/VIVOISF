package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapSici currentInstance = null;
	private static final Log log = LogFactory.getLog(MapSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapSiciIterator theMap = (MapSiciIterator)findAncestorWithClass(this, MapSiciIterator.class);
			pageContext.getOut().print(theMap.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for sici tag ");
		}
		return SKIP_BODY;
	}
}

