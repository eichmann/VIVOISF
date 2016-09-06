package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatorySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatorySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatorySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			if (!theExplanatory.commitNeeded) {
				pageContext.getOut().print(theExplanatory.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			return theExplanatory.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Explanatory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Explanatory theExplanatory = (Explanatory)findAncestorWithClass(this, Explanatory.class);
			theExplanatory.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for subjectURI tag ");
		}
	}
}

