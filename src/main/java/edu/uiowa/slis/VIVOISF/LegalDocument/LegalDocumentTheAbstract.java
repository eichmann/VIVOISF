package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocumentTheAbstractIterator theLegalDocument = (LegalDocumentTheAbstractIterator)findAncestorWithClass(this, LegalDocumentTheAbstractIterator.class);
			pageContext.getOut().print(theLegalDocument.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

