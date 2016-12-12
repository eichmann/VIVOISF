package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaAgriculturalAreaTotalIterator theArea = (AreaAgriculturalAreaTotalIterator)findAncestorWithClass(this, AreaAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theArea.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

