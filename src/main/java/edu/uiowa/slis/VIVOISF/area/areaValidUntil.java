package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(areaValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaValidUntilIterator thearea = (areaValidUntilIterator)findAncestorWithClass(this, areaValidUntilIterator.class);
			pageContext.getOut().print(thearea.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing area for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

