package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityESIterator thearea = (areaNationalityESIterator)findAncestorWithClass(this, areaNationalityESIterator.class);
			pageContext.getOut().print(thearea.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

