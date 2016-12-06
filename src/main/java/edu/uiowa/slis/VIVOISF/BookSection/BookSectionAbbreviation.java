package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			if (!theBookSection.commitNeeded) {
				pageContext.getOut().print(theBookSection.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			return theBookSection.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing BookSection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			theBookSection.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for abbreviation tag ");
		}
	}
}

