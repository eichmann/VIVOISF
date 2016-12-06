package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHDIYearIterator thearea = (areaHDIYearIterator)findAncestorWithClass(this, areaHDIYearIterator.class);
			pageContext.getOut().print(thearea.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

