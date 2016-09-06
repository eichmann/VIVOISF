package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalFeaturesIterator theJournalFeaturesIterator = (JournalFeaturesIterator)findAncestorWithClass(this, JournalFeaturesIterator.class);
			pageContext.getOut().print(theJournalFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for features tag ");
		}
		return SKIP_BODY;
	}
}

