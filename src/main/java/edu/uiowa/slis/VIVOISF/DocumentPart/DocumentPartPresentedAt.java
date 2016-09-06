package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartPresentedAtIterator theDocumentPartPresentedAtIterator = (DocumentPartPresentedAtIterator)findAncestorWithClass(this, DocumentPartPresentedAtIterator.class);
			pageContext.getOut().print(theDocumentPartPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

