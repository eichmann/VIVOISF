package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterPublisherOfIterator theCenterPublisherOfIterator = (CenterPublisherOfIterator)findAncestorWithClass(this, CenterPublisherOfIterator.class);
			pageContext.getOut().print(theCenterPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

