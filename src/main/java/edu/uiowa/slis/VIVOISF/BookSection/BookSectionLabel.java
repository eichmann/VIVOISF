package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			if (!theBookSection.commitNeeded) {
				pageContext.getOut().print(theBookSection.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			return theBookSection.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing BookSection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			theBookSection.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for label tag ");
		}
	}
}

