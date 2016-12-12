package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNameShortZHIterator theArea = (AreaNameShortZHIterator)findAncestorWithClass(this, AreaNameShortZHIterator.class);
			pageContext.getOut().print(theArea.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

