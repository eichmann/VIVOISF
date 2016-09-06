package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			if (!theFoundation.commitNeeded) {
				pageContext.getOut().print(theFoundation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			return theFoundation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Foundation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			theFoundation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for subjectURI tag ");
		}
	}
}

