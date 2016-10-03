package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(MapOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapOwnerIterator theMapOwnerIterator = (MapOwnerIterator)findAncestorWithClass(this, MapOwnerIterator.class);
			pageContext.getOut().print(theMapOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for owner tag ");
		}
		return SKIP_BODY;
	}
}

