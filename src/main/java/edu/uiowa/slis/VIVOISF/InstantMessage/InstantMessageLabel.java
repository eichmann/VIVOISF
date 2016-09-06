package edu.uiowa.slis.VIVOISF.InstantMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstantMessageLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstantMessageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(InstantMessageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			if (!theInstantMessage.commitNeeded) {
				pageContext.getOut().print(theInstantMessage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			return theInstantMessage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing InstantMessage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			InstantMessage theInstantMessage = (InstantMessage)findAncestorWithClass(this, InstantMessage.class);
			theInstantMessage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing InstantMessage for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing InstantMessage for label tag ");
		}
	}
}

