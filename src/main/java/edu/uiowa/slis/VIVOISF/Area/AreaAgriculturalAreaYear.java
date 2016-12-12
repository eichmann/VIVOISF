package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaAgriculturalAreaYearIterator theArea = (AreaAgriculturalAreaYearIterator)findAncestorWithClass(this, AreaAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theArea.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

