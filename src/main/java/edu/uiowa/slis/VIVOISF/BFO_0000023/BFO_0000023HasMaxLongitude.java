package edu.uiowa.slis.VIVOISF.BFO_0000023;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000023HasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000023HasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000023HasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000023HasMaxLongitudeIterator theBFO_0000023 = (BFO_0000023HasMaxLongitudeIterator)findAncestorWithClass(this, BFO_0000023HasMaxLongitudeIterator.class);
			pageContext.getOut().print(theBFO_0000023.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000023 for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000023 for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

