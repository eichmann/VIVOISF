package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHasMaxLatitudeIterator thearea = (areaHasMaxLatitudeIterator)findAncestorWithClass(this, areaHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thearea.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing area for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

