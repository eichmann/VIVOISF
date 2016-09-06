package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPresentedAtIterator theDocumentPresentedAtIterator = (DocumentPresentedAtIterator)findAncestorWithClass(this, DocumentPresentedAtIterator.class);
			pageContext.getOut().print(theDocumentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

