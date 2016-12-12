package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListITIterator theArea = (AreaNameListITIterator)findAncestorWithClass(this, AreaNameListITIterator.class);
			pageContext.getOut().print(theArea.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

