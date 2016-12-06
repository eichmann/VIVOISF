package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(areaMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaMiddleNameIterator thearea = (areaMiddleNameIterator)findAncestorWithClass(this, areaMiddleNameIterator.class);
			pageContext.getOut().print(thearea.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing area for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for middleName tag ");
		}
		return SKIP_BODY;
	}
}

