package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(areaNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaNationalityRUIterator thearea = (areaNationalityRUIterator)findAncestorWithClass(this, areaNationalityRUIterator.class);
			pageContext.getOut().print(thearea.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing area for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

