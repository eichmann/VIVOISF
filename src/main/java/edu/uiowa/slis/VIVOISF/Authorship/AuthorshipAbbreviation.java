package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for abbreviation tag ");
		}
	}
}

