package edu.uiowa.slis.VIVOISF.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class URLSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static URLSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(URLSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			if (!theURL.commitNeeded) {
				pageContext.getOut().print(theURL.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing URL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			return theURL.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing URL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			URL theURL = (URL)findAncestorWithClass(this, URL.class);
			theURL.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing URL for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing URL for subjectURI tag ");
		}
	}
}

