package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortFRIterator theArea = (AreaNameShortFRIterator)findAncestorWithClass(this, AreaNameShortFRIterator.class);
			pageContext.getOut().print(theArea.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

