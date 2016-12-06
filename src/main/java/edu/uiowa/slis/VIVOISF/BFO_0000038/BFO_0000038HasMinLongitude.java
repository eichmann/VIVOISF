package edu.uiowa.slis.VIVOISF.BFO_0000038;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000038HasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000038HasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000038HasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000038HasMinLongitudeIterator theBFO_0000038 = (BFO_0000038HasMinLongitudeIterator)findAncestorWithClass(this, BFO_0000038HasMinLongitudeIterator.class);
			pageContext.getOut().print(theBFO_0000038.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000038 for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000038 for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

