package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionAgriculturalAreaUnitIterator theeconomic_region = (economic_regionAgriculturalAreaUnitIterator)findAncestorWithClass(this, economic_regionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theeconomic_region.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

