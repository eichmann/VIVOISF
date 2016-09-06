package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			if (!theFoundation.commitNeeded) {
				pageContext.getOut().print(theFoundation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			return theFoundation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Foundation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			theFoundation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for label tag ");
		}
	}
}

