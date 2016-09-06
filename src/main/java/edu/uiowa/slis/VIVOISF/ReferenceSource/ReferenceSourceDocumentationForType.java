package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceDocumentationForType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceDocumentationForType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceDocumentationForType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceDocumentationForIterator theReferenceSourceDocumentationForIterator = (ReferenceSourceDocumentationForIterator)findAncestorWithClass(this, ReferenceSourceDocumentationForIterator.class);
			pageContext.getOut().print(theReferenceSourceDocumentationForIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

