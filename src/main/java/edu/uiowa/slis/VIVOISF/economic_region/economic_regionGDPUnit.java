package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionGDPUnitIterator theeconomic_region = (economic_regionGDPUnitIterator)findAncestorWithClass(this, economic_regionGDPUnitIterator.class);
			pageContext.getOut().print(theeconomic_region.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

