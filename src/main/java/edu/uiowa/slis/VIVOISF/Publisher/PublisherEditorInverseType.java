package edu.uiowa.slis.VIVOISF.Publisher;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PublisherEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PublisherEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PublisherEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PublisherEditorInverseIterator thePublisherEditorInverseIterator = (PublisherEditorInverseIterator)findAncestorWithClass(this, PublisherEditorInverseIterator.class);
			pageContext.getOut().print(thePublisherEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Publisher for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Publisher for editor tag ");
		}
		return SKIP_BODY;
	}
}

