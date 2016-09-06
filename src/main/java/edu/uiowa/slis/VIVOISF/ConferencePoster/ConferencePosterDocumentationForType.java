package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDocumentationForIterator theConferencePosterDocumentationForIterator = (ConferencePosterDocumentationForIterator)findAncestorWithClass(this, ConferencePosterDocumentationForIterator.class);
			pageContext.getOut().print(theConferencePosterDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

