package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentIAO_0000136Iterator theLegalCaseDocumentIAO_0000136Iterator = (LegalCaseDocumentIAO_0000136Iterator)findAncestorWithClass(this, LegalCaseDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theLegalCaseDocumentIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

