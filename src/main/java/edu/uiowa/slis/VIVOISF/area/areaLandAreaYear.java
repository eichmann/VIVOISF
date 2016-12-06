package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(areaLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaLandAreaYearIterator thearea = (areaLandAreaYearIterator)findAncestorWithClass(this, areaLandAreaYearIterator.class);
			pageContext.getOut().print(thearea.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing area for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

