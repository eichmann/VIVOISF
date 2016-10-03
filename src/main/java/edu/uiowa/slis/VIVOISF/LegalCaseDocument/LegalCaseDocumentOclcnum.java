package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocumentOclcnumIterator theLegalCaseDocument = (LegalCaseDocumentOclcnumIterator)findAncestorWithClass(this, LegalCaseDocumentOclcnumIterator.class);
			pageContext.getOut().print(theLegalCaseDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

