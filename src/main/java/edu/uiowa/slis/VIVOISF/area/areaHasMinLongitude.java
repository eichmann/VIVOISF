package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasMinLongitudeIterator thearea = (areaHasMinLongitudeIterator)findAncestorWithClass(this, areaHasMinLongitudeIterator.class);
			pageContext.getOut().print(thearea.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

