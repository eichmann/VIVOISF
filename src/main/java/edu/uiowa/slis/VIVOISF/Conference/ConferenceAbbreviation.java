package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			if (!theConference.commitNeeded) {
				pageContext.getOut().print(theConference.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			return theConference.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Conference for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Conference theConference = (Conference)findAncestorWithClass(this, Conference.class);
			theConference.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for abbreviation tag ");
		}
	}
}

