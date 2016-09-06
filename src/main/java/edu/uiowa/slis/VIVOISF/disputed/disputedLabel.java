package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			if (!thedisputed.commitNeeded) {
				pageContext.getOut().print(thedisputed.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			return thedisputed.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing disputed for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			disputed thedisputed = (disputed)findAncestorWithClass(this, disputed.class);
			thedisputed.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for label tag ");
		}
	}
}

