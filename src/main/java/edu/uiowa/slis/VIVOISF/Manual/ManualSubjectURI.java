package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			if (!theManual.commitNeeded) {
				pageContext.getOut().print(theManual.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			return theManual.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Manual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Manual theManual = (Manual)findAncestorWithClass(this, Manual.class);
			theManual.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for subjectURI tag ");
		}
	}
}

