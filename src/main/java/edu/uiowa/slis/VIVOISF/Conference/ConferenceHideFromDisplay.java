package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			if (!theConference.commitNeeded) {
				pageContext.getOut().print(theConference.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			return theConference.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Conference for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			theConference.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hideFromDisplay tag ");
		}
	}
}

