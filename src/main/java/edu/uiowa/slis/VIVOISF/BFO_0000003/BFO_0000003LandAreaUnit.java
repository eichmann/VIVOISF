package edu.uiowa.slis.VIVOISF.BFO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000003LandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000003LandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000003LandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000003LandAreaUnitIterator theBFO_0000003 = (BFO_0000003LandAreaUnitIterator)findAncestorWithClass(this, BFO_0000003LandAreaUnitIterator.class);
			pageContext.getOut().print(theBFO_0000003.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000003 for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000003 for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

