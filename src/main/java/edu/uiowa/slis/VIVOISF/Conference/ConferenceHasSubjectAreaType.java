package edu.uiowa.slis.VIVOISF.Conference;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferenceHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferenceHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferenceHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferenceHasSubjectAreaIterator theConferenceHasSubjectAreaIterator = (ConferenceHasSubjectAreaIterator)findAncestorWithClass(this, ConferenceHasSubjectAreaIterator.class);
			pageContext.getOut().print(theConferenceHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Conference for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Conference for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

