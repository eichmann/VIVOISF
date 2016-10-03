package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentOwnerIterator theLegalDocumentOwnerIterator = (LegalDocumentOwnerIterator)findAncestorWithClass(this, LegalDocumentOwnerIterator.class);
			pageContext.getOut().print(theLegalDocumentOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for owner tag ");
		}
		return SKIP_BODY;
	}
}

