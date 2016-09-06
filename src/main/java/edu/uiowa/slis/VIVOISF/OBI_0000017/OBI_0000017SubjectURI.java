package edu.uiowa.slis.VIVOISF.OBI_0000017;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000017SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000017SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000017SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000017 theOBI_0000017 = (OBI_0000017)findAncestorWithClass(this, OBI_0000017.class);
			if (!theOBI_0000017.commitNeeded) {
				pageContext.getOut().print(theOBI_0000017.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000017 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OBI_0000017 theOBI_0000017 = (OBI_0000017)findAncestorWithClass(this, OBI_0000017.class);
			return theOBI_0000017.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0000017 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OBI_0000017 theOBI_0000017 = (OBI_0000017)findAncestorWithClass(this, OBI_0000017.class);
			theOBI_0000017.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000017 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000017 for subjectURI tag ");
		}
	}
}

