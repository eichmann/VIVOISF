package edu.uiowa.slis.VIVOISF.Sibling;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SiblingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SiblingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SiblingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			if (!theSibling.commitNeeded) {
				pageContext.getOut().print(theSibling.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sibling for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			return theSibling.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sibling for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Sibling theSibling = (Sibling)findAncestorWithClass(this, Sibling.class);
			theSibling.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Sibling for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sibling for label tag ");
		}
	}
}

