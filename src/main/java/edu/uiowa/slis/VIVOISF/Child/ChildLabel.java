package edu.uiowa.slis.VIVOISF.Child;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ChildLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ChildLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ChildLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			if (!theChild.commitNeeded) {
				pageContext.getOut().print(theChild.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Child for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			return theChild.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Child for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Child theChild = (Child)findAncestorWithClass(this, Child.class);
			theChild.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Child for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Child for label tag ");
		}
	}
}

