package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			if (!theThesis.commitNeeded) {
				pageContext.getOut().print(theThesis.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			return theThesis.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thesis for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Thesis theThesis = (Thesis)findAncestorWithClass(this, Thesis.class);
			theThesis.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for subjectURI tag ");
		}
	}
}

