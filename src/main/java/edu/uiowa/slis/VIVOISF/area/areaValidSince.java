package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(areaValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaValidSinceIterator thearea = (areaValidSinceIterator)findAncestorWithClass(this, areaValidSinceIterator.class);
			pageContext.getOut().print(thearea.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing area for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for validSince tag ");
		}
		return SKIP_BODY;
	}
}

