package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaLandAreaTotalIterator theArea = (AreaLandAreaTotalIterator)findAncestorWithClass(this, AreaLandAreaTotalIterator.class);
			pageContext.getOut().print(theArea.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

