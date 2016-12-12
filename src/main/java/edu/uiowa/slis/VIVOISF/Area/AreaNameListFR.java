package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameListFRIterator theArea = (AreaNameListFRIterator)findAncestorWithClass(this, AreaNameListFRIterator.class);
			pageContext.getOut().print(theArea.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

