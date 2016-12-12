package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaLandAreaUnitIterator theArea = (AreaLandAreaUnitIterator)findAncestorWithClass(this, AreaLandAreaUnitIterator.class);
			pageContext.getOut().print(theArea.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

