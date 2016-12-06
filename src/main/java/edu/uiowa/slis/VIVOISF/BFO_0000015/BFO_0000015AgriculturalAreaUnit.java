package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015AgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015AgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015AgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015AgriculturalAreaUnitIterator theBFO_0000015 = (BFO_0000015AgriculturalAreaUnitIterator)findAncestorWithClass(this, BFO_0000015AgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theBFO_0000015.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

