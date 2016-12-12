package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaGDPYearIterator theArea = (AreaGDPYearIterator)findAncestorWithClass(this, AreaGDPYearIterator.class);
			pageContext.getOut().print(theArea.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

