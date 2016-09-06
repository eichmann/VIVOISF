package edu.uiowa.slis.VIVOISF.OBI_0500000;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0500000SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0500000SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0500000SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0500000 theOBI_0500000 = (OBI_0500000)findAncestorWithClass(this, OBI_0500000.class);
			if (!theOBI_0500000.commitNeeded) {
				pageContext.getOut().print(theOBI_0500000.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OBI_0500000 theOBI_0500000 = (OBI_0500000)findAncestorWithClass(this, OBI_0500000.class);
			return theOBI_0500000.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0500000 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OBI_0500000 theOBI_0500000 = (OBI_0500000)findAncestorWithClass(this, OBI_0500000.class);
			theOBI_0500000.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0500000 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0500000 for subjectURI tag ");
		}
	}
}

