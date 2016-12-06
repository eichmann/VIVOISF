package edu.uiowa.slis.VIVOISF.BFO_0000148;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000148LandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000148LandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000148LandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000148LandAreaUnitIterator theBFO_0000148 = (BFO_0000148LandAreaUnitIterator)findAncestorWithClass(this, BFO_0000148LandAreaUnitIterator.class);
			pageContext.getOut().print(theBFO_0000148.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000148 for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000148 for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

