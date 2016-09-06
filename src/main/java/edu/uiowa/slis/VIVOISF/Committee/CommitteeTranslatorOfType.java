package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeTranslatorOfIterator theCommitteeTranslatorOfIterator = (CommitteeTranslatorOfIterator)findAncestorWithClass(this, CommitteeTranslatorOfIterator.class);
			pageContext.getOut().print(theCommitteeTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

