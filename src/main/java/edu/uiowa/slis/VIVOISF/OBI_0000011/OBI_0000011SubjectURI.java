package edu.uiowa.slis.VIVOISF.OBI_0000011;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000011SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000011SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000011SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OBI_0000011 theOBI_0000011 = (OBI_0000011)findAncestorWithClass(this, OBI_0000011.class);
			if (!theOBI_0000011.commitNeeded) {
				pageContext.getOut().print(theOBI_0000011.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OBI_0000011 theOBI_0000011 = (OBI_0000011)findAncestorWithClass(this, OBI_0000011.class);
			return theOBI_0000011.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OBI_0000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OBI_0000011 theOBI_0000011 = (OBI_0000011)findAncestorWithClass(this, OBI_0000011.class);
			theOBI_0000011.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000011 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000011 for subjectURI tag ");
		}
	}
}

