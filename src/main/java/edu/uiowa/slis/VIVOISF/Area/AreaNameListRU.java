package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListRUIterator theArea = (AreaNameListRUIterator)findAncestorWithClass(this, AreaNameListRUIterator.class);
			pageContext.getOut().print(theArea.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

