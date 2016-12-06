package edu.uiowa.slis.VIVOISF.BFO_0000006;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000006HasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000006HasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000006HasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000006HasMinLongitudeIterator theBFO_0000006 = (BFO_0000006HasMinLongitudeIterator)findAncestorWithClass(this, BFO_0000006HasMinLongitudeIterator.class);
			pageContext.getOut().print(theBFO_0000006.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000006 for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000006 for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

