package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterSponsorsIterator theCenterSponsorsIterator = (CenterSponsorsIterator)findAncestorWithClass(this, CenterSponsorsIterator.class);
			pageContext.getOut().print(theCenterSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

