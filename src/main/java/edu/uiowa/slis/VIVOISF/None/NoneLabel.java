package edu.uiowa.slis.VIVOISF.None;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoneLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoneLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NoneLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			if (!theNone.commitNeeded) {
				pageContext.getOut().print(theNone.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing None for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			return theNone.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing None for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			None theNone = (None)findAncestorWithClass(this, None.class);
			theNone.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing None for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing None for label tag ");
		}
	}
}

