package edu.uiowa.slis.VIVOISF.Postdoc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			if (!thePostdoc.commitNeeded) {
				pageContext.getOut().print(thePostdoc.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			return thePostdoc.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Postdoc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Postdoc thePostdoc = (Postdoc)findAncestorWithClass(this, Postdoc.class);
			thePostdoc.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Postdoc for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Postdoc for label tag ");
		}
	}
}

