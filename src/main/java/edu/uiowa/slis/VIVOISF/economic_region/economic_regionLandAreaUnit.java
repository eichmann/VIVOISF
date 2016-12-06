package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionLandAreaUnitIterator theeconomic_region = (economic_regionLandAreaUnitIterator)findAncestorWithClass(this, economic_regionLandAreaUnitIterator.class);
			pageContext.getOut().print(theeconomic_region.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

