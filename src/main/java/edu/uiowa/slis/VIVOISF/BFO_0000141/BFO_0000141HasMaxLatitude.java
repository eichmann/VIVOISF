package edu.uiowa.slis.VIVOISF.BFO_0000141;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000141HasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000141HasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000141HasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000141HasMaxLatitudeIterator theBFO_0000141 = (BFO_0000141HasMaxLatitudeIterator)findAncestorWithClass(this, BFO_0000141HasMaxLatitudeIterator.class);
			pageContext.getOut().print(theBFO_0000141.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000141 for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000141 for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

