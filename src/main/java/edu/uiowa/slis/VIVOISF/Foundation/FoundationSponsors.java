package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationSponsorsIterator theFoundationSponsorsIterator = (FoundationSponsorsIterator)findAncestorWithClass(this, FoundationSponsorsIterator.class);
			pageContext.getOut().print(theFoundationSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

