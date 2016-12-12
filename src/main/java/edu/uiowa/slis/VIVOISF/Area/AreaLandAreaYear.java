package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaLandAreaYearIterator theArea = (AreaLandAreaYearIterator)findAncestorWithClass(this, AreaLandAreaYearIterator.class);
			pageContext.getOut().print(theArea.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

