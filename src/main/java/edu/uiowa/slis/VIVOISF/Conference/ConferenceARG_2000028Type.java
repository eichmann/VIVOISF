package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceARG_2000028Iterator theConferenceARG_2000028Iterator = (ConferenceARG_2000028Iterator)findAncestorWithClass(this, ConferenceARG_2000028Iterator.class);
			pageContext.getOut().print(theConferenceARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

