package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565PublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565PublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565PublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565PublisherOfIterator theERO_0000565PublisherOfIterator = (ERO_0000565PublisherOfIterator)findAncestorWithClass(this, ERO_0000565PublisherOfIterator.class);
			pageContext.getOut().print(theERO_0000565PublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

