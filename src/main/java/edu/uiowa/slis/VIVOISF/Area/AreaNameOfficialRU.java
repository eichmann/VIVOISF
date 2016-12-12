package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameOfficialRUIterator theArea = (AreaNameOfficialRUIterator)findAncestorWithClass(this, AreaNameOfficialRUIterator.class);
			pageContext.getOut().print(theArea.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

