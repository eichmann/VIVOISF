package edu.uiowa.slis.VIVOISF.BFO_0000004;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000004AgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000004AgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000004AgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000004AgriculturalAreaYearIterator theBFO_0000004 = (BFO_0000004AgriculturalAreaYearIterator)findAncestorWithClass(this, BFO_0000004AgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theBFO_0000004.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000004 for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000004 for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

