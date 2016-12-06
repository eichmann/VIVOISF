package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityARIterator thearea = (areaNationalityARIterator)findAncestorWithClass(this, areaNationalityARIterator.class);
			pageContext.getOut().print(thearea.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

