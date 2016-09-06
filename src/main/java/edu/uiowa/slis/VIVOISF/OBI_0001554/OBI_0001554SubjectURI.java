package edu.uiowa.slis.VIVOISF.OBI_0001554;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0001554SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0001554SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0001554SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			if (!theOBI_0001554.commitNeeded) {
				pageContext.getOut().print(theOBI_0001554.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			return theOBI_0001554.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0001554 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OBI_0001554 theOBI_0001554 = (OBI_0001554)findAncestorWithClass(this, OBI_0001554.class);
			theOBI_0001554.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0001554 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0001554 for subjectURI tag ");
		}
	}
}

