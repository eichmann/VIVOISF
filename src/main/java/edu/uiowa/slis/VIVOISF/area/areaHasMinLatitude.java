package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasMinLatitudeIterator thearea = (areaHasMinLatitudeIterator)findAncestorWithClass(this, areaHasMinLatitudeIterator.class);
			pageContext.getOut().print(thearea.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

