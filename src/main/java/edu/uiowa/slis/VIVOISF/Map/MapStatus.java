package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(MapStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapStatusIterator theMapStatusIterator = (MapStatusIterator)findAncestorWithClass(this, MapStatusIterator.class);
			pageContext.getOut().print(theMapStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for status tag ");
		}
		return SKIP_BODY;
	}
}

