package edu.uiowa.slis.VIVOISF.Me;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MeLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			if (!theMe.commitNeeded) {
				pageContext.getOut().print(theMe.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Me for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			return theMe.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Me for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Me theMe = (Me)findAncestorWithClass(this, Me.class);
			theMe.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Me for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Me for label tag ");
		}
	}
}

