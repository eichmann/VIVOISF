package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(areaAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaAgriculturalAreaUnitIterator thearea = (areaAgriculturalAreaUnitIterator)findAncestorWithClass(this, areaAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(thearea.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing area for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

