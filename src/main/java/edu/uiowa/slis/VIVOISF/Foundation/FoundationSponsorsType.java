package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationSponsorsIterator theFoundationSponsorsIterator = (FoundationSponsorsIterator)findAncestorWithClass(this, FoundationSponsorsIterator.class);
			pageContext.getOut().print(theFoundationSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

