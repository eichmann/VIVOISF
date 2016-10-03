package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherEditorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherEditorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherEditorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherEditorInverseIterator thePublisherEditorInverseIterator = (PublisherEditorInverseIterator)findAncestorWithClass(this, PublisherEditorInverseIterator.class);
			pageContext.getOut().print(thePublisherEditorInverseIterator.getEditorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for editor tag ");
		}
		return SKIP_BODY;
	}
}

