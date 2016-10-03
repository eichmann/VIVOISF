package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565CourtInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565CourtInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565CourtInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565CourtInverseIterator theERO_0000565CourtInverseIterator = (ERO_0000565CourtInverseIterator)findAncestorWithClass(this, ERO_0000565CourtInverseIterator.class);
			pageContext.getOut().print(theERO_0000565CourtInverseIterator.getCourtInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for court tag ");
		}
		return SKIP_BODY;
	}
}

