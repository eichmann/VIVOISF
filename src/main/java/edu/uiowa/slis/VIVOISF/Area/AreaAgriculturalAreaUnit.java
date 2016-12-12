package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaAgriculturalAreaUnitIterator theArea = (AreaAgriculturalAreaUnitIterator)findAncestorWithClass(this, AreaAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theArea.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

