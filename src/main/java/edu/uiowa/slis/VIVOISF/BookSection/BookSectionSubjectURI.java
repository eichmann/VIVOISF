package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			if (!theBookSection.commitNeeded) {
				pageContext.getOut().print(theBookSection.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			return theBookSection.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing BookSection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			theBookSection.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for subjectURI tag ");
		}
	}
}

