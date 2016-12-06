package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityFRIterator thearea = (areaNationalityFRIterator)findAncestorWithClass(this, areaNationalityFRIterator.class);
			pageContext.getOut().print(thearea.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

