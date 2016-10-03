package edu.uiowa.slis.VIVOISF.Newsletter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewsletterEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewsletterEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewsletterEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewsletterEditorIterator theNewsletterEditorIterator = (NewsletterEditorIterator)findAncestorWithClass(this, NewsletterEditorIterator.class);
			pageContext.getOut().print(theNewsletterEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newsletter for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newsletter for editor tag ");
		}
		return SKIP_BODY;
	}
}

