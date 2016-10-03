package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(MapHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapHandleIterator theMap = (MapHandleIterator)findAncestorWithClass(this, MapHandleIterator.class);
			pageContext.getOut().print(theMap.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for handle tag ");
		}
		return SKIP_BODY;
	}
}

