package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentPresentedAtIterator theCollectedDocumentPresentedAtIterator = (CollectedDocumentPresentedAtIterator)findAncestorWithClass(this, CollectedDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theCollectedDocumentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

