package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002LandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002LandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002LandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002LandAreaUnitIterator theBFO_0000002 = (BFO_0000002LandAreaUnitIterator)findAncestorWithClass(this, BFO_0000002LandAreaUnitIterator.class);
			pageContext.getOut().print(theBFO_0000002.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

