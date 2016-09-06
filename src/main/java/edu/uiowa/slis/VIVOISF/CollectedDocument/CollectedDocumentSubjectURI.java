package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			if (!theCollectedDocument.commitNeeded) {
				pageContext.getOut().print(theCollectedDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			return theCollectedDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing CollectedDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			CollectedDocument theCollectedDocument = (CollectedDocument)findAncestorWithClass(this, CollectedDocument.class);
			theCollectedDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for subjectURI tag ");
		}
	}
}

