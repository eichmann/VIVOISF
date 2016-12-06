package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasResearchAreaIterator theConferenceHasResearchAreaIterator = (ConferenceHasResearchAreaIterator)findAncestorWithClass(this, ConferenceHasResearchAreaIterator.class);
			pageContext.getOut().print(theConferenceHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

