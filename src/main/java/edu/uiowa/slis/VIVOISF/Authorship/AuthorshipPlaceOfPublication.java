package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for placeOfPublication tag ");
		}
	}
}

