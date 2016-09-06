package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			if (!theLibrary.commitNeeded) {
				pageContext.getOut().print(theLibrary.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Library for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			return theLibrary.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Library for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			theLibrary.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Library for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for subjectURI tag ");
		}
	}
}

