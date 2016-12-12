package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListARIterator theArea = (AreaNameListARIterator)findAncestorWithClass(this, AreaNameListARIterator.class);
			pageContext.getOut().print(theArea.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

