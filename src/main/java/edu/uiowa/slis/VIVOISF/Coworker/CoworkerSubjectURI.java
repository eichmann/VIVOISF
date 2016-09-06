package edu.uiowa.slis.VIVOISF.Coworker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoworkerSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoworkerSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CoworkerSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			if (!theCoworker.commitNeeded) {
				pageContext.getOut().print(theCoworker.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Coworker for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			return theCoworker.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Coworker for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Coworker theCoworker = (Coworker)findAncestorWithClass(this, Coworker.class);
			theCoworker.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Coworker for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Coworker for subjectURI tag ");
		}
	}
}

