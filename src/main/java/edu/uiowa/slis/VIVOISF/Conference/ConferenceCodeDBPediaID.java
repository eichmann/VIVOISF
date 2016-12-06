package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferenceCodeDBPediaIDIterator theConference = (ConferenceCodeDBPediaIDIterator)findAncestorWithClass(this, ConferenceCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theConference.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

