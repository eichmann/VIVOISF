package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			if (!theDocumentPart.commitNeeded) {
				pageContext.getOut().print(theDocumentPart.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			return theDocumentPart.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DocumentPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DocumentPart theDocumentPart = (DocumentPart)findAncestorWithClass(this, DocumentPart.class);
			theDocumentPart.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for subjectURI tag ");
		}
	}
}

