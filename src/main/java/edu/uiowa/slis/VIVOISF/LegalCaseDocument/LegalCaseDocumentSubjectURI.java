package edu.uiowa.slis.VIVOISF.LegalCaseDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalCaseDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalCaseDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalCaseDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			if (!theLegalCaseDocument.commitNeeded) {
				pageContext.getOut().print(theLegalCaseDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			return theLegalCaseDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalCaseDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LegalCaseDocument theLegalCaseDocument = (LegalCaseDocument)findAncestorWithClass(this, LegalCaseDocument.class);
			theLegalCaseDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalCaseDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalCaseDocument for subjectURI tag ");
		}
	}
}

