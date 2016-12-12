package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHDITotalIterator theArea = (AreaHDITotalIterator)findAncestorWithClass(this, AreaHDITotalIterator.class);
			pageContext.getOut().print(theArea.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

