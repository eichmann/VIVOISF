package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHasMaxLongitudeIterator theArea = (AreaHasMaxLongitudeIterator)findAncestorWithClass(this, AreaHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theArea.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

