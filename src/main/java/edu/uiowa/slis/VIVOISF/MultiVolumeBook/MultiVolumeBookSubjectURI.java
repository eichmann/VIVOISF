package edu.uiowa.slis.VIVOISF.MultiVolumeBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultiVolumeBookSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MultiVolumeBookSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MultiVolumeBookSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			if (!theMultiVolumeBook.commitNeeded) {
				pageContext.getOut().print(theMultiVolumeBook.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			return theMultiVolumeBook.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MultiVolumeBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MultiVolumeBook theMultiVolumeBook = (MultiVolumeBook)findAncestorWithClass(this, MultiVolumeBook.class);
			theMultiVolumeBook.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MultiVolumeBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MultiVolumeBook for subjectURI tag ");
		}
	}
}

