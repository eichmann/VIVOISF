package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015LandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015LandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015LandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015LandAreaUnitIterator theBFO_0000015 = (BFO_0000015LandAreaUnitIterator)findAncestorWithClass(this, BFO_0000015LandAreaUnitIterator.class);
			pageContext.getOut().print(theBFO_0000015.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

