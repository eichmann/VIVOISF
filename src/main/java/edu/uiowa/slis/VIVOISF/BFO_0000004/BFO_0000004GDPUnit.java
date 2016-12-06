package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004GDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004GDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004GDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004GDPUnitIterator theBFO_0000004 = (BFO_0000004GDPUnitIterator)findAncestorWithClass(this, BFO_0000004GDPUnitIterator.class);
			pageContext.getOut().print(theBFO_0000004.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

