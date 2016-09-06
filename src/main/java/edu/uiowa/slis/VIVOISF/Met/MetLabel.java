package edu.uiowa.slis.VIVOISF.Met;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MetLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MetLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MetLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			if (!theMet.commitNeeded) {
				pageContext.getOut().print(theMet.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Met for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			return theMet.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Met for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Met theMet = (Met)findAncestorWithClass(this, Met.class);
			theMet.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Met for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Met for label tag ");
		}
	}
}

