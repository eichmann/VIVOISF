package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaGDPYearIterator thearea = (areaGDPYearIterator)findAncestorWithClass(this, areaGDPYearIterator.class);
			pageContext.getOut().print(thearea.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

