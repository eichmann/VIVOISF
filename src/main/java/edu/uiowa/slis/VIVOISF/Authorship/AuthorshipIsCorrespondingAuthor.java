package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipIsCorrespondingAuthor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipIsCorrespondingAuthor currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipIsCorrespondingAuthor.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getIsCorrespondingAuthor());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for isCorrespondingAuthor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for isCorrespondingAuthor tag ");
		}
		return SKIP_BODY;
	}

	public String getIsCorrespondingAuthor() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getIsCorrespondingAuthor();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for isCorrespondingAuthor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for isCorrespondingAuthor tag ");
		}
	}

	public void setIsCorrespondingAuthor(String isCorrespondingAuthor) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setIsCorrespondingAuthor(isCorrespondingAuthor);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for isCorrespondingAuthor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for isCorrespondingAuthor tag ");
		}
	}
}

