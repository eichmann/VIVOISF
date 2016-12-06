package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015HasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015HasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015HasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015HasMinLongitudeIterator theBFO_0000015 = (BFO_0000015HasMinLongitudeIterator)findAncestorWithClass(this, BFO_0000015HasMinLongitudeIterator.class);
			pageContext.getOut().print(theBFO_0000015.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

