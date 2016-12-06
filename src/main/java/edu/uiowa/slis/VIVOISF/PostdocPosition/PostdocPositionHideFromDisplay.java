package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			if (!thePostdocPosition.commitNeeded) {
				pageContext.getOut().print(thePostdocPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			return thePostdocPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			thePostdocPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for hideFromDisplay tag ");
		}
	}
}

