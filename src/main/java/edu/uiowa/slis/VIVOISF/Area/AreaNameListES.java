package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListESIterator theArea = (AreaNameListESIterator)findAncestorWithClass(this, AreaNameListESIterator.class);
			pageContext.getOut().print(theArea.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

