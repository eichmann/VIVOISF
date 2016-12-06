package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002HDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002HDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002HDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002HDIYearIterator theBFO_0000002 = (BFO_0000002HDIYearIterator)findAncestorWithClass(this, BFO_0000002HDIYearIterator.class);
			pageContext.getOut().print(theBFO_0000002.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

