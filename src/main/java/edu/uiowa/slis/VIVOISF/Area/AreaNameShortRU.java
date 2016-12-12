package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortRUIterator theArea = (AreaNameShortRUIterator)findAncestorWithClass(this, AreaNameShortRUIterator.class);
			pageContext.getOut().print(theArea.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

