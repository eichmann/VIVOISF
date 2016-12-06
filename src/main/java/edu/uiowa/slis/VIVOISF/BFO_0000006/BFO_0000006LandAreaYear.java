package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006LandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006LandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006LandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006LandAreaYearIterator theBFO_0000006 = (BFO_0000006LandAreaYearIterator)findAncestorWithClass(this, BFO_0000006LandAreaYearIterator.class);
			pageContext.getOut().print(theBFO_0000006.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

