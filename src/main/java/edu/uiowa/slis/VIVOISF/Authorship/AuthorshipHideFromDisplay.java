package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hideFromDisplay tag ");
		}
	}
}

