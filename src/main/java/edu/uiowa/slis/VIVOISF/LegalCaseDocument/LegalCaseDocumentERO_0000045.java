package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentERO_0000045Iterator theLegalCaseDocument = (LegalCaseDocumentERO_0000045Iterator)findAncestorWithClass(this, LegalCaseDocumentERO_0000045Iterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

