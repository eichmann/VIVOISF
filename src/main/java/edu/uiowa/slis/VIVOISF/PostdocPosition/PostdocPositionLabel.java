package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			if (!thePostdocPosition.commitNeeded) {
				pageContext.getOut().print(thePostdocPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			return thePostdocPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PostdocPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PostdocPosition thePostdocPosition = (PostdocPosition)findAncestorWithClass(this, PostdocPosition.class);
			thePostdocPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for label tag ");
		}
	}
}

