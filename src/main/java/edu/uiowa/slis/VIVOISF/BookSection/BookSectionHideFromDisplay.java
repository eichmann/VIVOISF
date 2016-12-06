package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			if (!theBookSection.commitNeeded) {
				pageContext.getOut().print(theBookSection.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			return theBookSection.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing BookSection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			theBookSection.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hideFromDisplay tag ");
		}
	}
}

