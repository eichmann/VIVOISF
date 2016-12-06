package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasMaxLongitudeIterator thearea = (areaHasMaxLongitudeIterator)findAncestorWithClass(this, areaHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thearea.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

