package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDocumentationForIterator theConferencePosterDocumentationForIterator = (ConferencePosterDocumentationForIterator)findAncestorWithClass(this, ConferencePosterDocumentationForIterator.class);
			pageContext.getOut().print(theConferencePosterDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

