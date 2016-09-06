package edu.uiowa.slis.VIVOISF.Committee;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommitteeTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommitteeTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CommitteeTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommitteeTranslatorOfIterator theCommitteeTranslatorOfIterator = (CommitteeTranslatorOfIterator)findAncestorWithClass(this, CommitteeTranslatorOfIterator.class);
			pageContext.getOut().print(theCommitteeTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Committee for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Committee for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

