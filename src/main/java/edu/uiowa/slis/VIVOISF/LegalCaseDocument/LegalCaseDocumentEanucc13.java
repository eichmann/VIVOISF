package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentEanucc13Iterator theLegalCaseDocument = (LegalCaseDocumentEanucc13Iterator)findAncestorWithClass(this, LegalCaseDocumentEanucc13Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

