package edu.uiowa.slis.VIVOISF.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MapPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapPresentedAtIterator theMapPresentedAtIterator = (MapPresentedAtIterator)findAncestorWithClass(this, MapPresentedAtIterator.class);
			pageContext.getOut().print(theMapPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

