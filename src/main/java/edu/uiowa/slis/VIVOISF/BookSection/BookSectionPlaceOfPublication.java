package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			if (!theBookSection.commitNeeded) {
				pageContext.getOut().print(theBookSection.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			return theBookSection.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing BookSection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			BookSection theBookSection = (BookSection)findAncestorWithClass(this, BookSection.class);
			theBookSection.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for placeOfPublication tag ");
		}
	}
}

