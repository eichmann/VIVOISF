package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityITIterator thearea = (areaNationalityITIterator)findAncestorWithClass(this, areaNationalityITIterator.class);
			pageContext.getOut().print(thearea.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

