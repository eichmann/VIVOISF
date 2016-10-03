package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(MapNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapNumberIterator theMap = (MapNumberIterator)findAncestorWithClass(this, MapNumberIterator.class);
			pageContext.getOut().print(theMap.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for number tag ");
		}
		return SKIP_BODY;
	}
}

