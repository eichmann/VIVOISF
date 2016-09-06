package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentARG_0000001Iterator theLegalCaseDocument = (LegalCaseDocumentARG_0000001Iterator)findAncestorWithClass(this, LegalCaseDocumentARG_0000001Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

