package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaHasMaxLatitudeIterator theArea = (AreaHasMaxLatitudeIterator)findAncestorWithClass(this, AreaHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theArea.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

