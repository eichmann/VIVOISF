package edu.uiowa.slis.VIVOISF.Hearing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class HearingLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static HearingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(HearingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			if (!theHearing.commitNeeded) {
				pageContext.getOut().print(theHearing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			return theHearing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Hearing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Hearing theHearing = (Hearing)findAncestorWithClass(this, Hearing.class);
			theHearing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Hearing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Hearing for label tag ");
		}
	}
}

