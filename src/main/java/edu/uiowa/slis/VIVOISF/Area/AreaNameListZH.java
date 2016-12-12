package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListZHIterator theArea = (AreaNameListZHIterator)findAncestorWithClass(this, AreaNameListZHIterator.class);
			pageContext.getOut().print(theArea.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

