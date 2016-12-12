package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHDIYearIterator theArea = (AreaHDIYearIterator)findAncestorWithClass(this, AreaHDIYearIterator.class);
			pageContext.getOut().print(theArea.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

