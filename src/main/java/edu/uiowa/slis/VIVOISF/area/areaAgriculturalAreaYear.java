package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaAgriculturalAreaYearIterator thearea = (areaAgriculturalAreaYearIterator)findAncestorWithClass(this, areaAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thearea.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

