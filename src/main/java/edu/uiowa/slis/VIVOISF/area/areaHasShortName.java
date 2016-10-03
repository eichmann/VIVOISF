package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasShortNameIterator thearea = (areaHasShortNameIterator)findAncestorWithClass(this, areaHasShortNameIterator.class);
			pageContext.getOut().print(thearea.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

