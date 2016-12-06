package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			if (!thePostdocPosition.commitNeeded) {
				pageContext.getOut().print(thePostdocPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			return thePostdocPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			thePostdocPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for abbreviation tag ");
		}
	}
}

