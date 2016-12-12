package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHasMinLongitudeIterator theArea = (AreaHasMinLongitudeIterator)findAncestorWithClass(this, AreaHasMinLongitudeIterator.class);
			pageContext.getOut().print(theArea.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

