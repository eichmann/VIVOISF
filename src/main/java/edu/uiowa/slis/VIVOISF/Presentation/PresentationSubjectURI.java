package edu.uiowa.slis.VIVOISF.Presentation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresentationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresentationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PresentationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			if (!thePresentation.commitNeeded) {
				pageContext.getOut().print(thePresentation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			return thePresentation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Presentation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Presentation thePresentation = (Presentation)findAncestorWithClass(this, Presentation.class);
			thePresentation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Presentation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Presentation for subjectURI tag ");
		}
	}
}

