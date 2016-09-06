package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565Sponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565Sponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565Sponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565SponsorsIterator theERO_0000565SponsorsIterator = (ERO_0000565SponsorsIterator)findAncestorWithClass(this, ERO_0000565SponsorsIterator.class);
			pageContext.getOut().print(theERO_0000565SponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

