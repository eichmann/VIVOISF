package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortARIterator theArea = (AreaNameShortARIterator)findAncestorWithClass(this, AreaNameShortARIterator.class);
			pageContext.getOut().print(theArea.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

