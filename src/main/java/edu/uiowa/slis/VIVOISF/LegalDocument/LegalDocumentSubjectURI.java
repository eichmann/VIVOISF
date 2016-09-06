package edu.uiowa.slis.VIVOISF.LegalDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegalDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegalDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LegalDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			if (!theLegalDocument.commitNeeded) {
				pageContext.getOut().print(theLegalDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			return theLegalDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LegalDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LegalDocument theLegalDocument = (LegalDocument)findAncestorWithClass(this, LegalDocument.class);
			theLegalDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LegalDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LegalDocument for subjectURI tag ");
		}
	}
}

