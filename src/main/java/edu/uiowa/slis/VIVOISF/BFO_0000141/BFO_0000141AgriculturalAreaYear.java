package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141AgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141AgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141AgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141AgriculturalAreaYearIterator theBFO_0000141 = (BFO_0000141AgriculturalAreaYearIterator)findAncestorWithClass(this, BFO_0000141AgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theBFO_0000141.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

