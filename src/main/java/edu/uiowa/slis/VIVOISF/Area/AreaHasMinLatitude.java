package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHasMinLatitudeIterator theArea = (AreaHasMinLatitudeIterator)findAncestorWithClass(this, AreaHasMinLatitudeIterator.class);
			pageContext.getOut().print(theArea.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

