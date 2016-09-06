package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDocumentationForIterator theConferencePaperDocumentationForIterator = (ConferencePaperDocumentationForIterator)findAncestorWithClass(this, ConferencePaperDocumentationForIterator.class);
			pageContext.getOut().print(theConferencePaperDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

