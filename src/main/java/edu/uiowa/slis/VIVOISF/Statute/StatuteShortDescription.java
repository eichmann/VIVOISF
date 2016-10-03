package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteShortDescriptionIterator theStatute = (StatuteShortDescriptionIterator)findAncestorWithClass(this, StatuteShortDescriptionIterator.class);
			pageContext.getOut().print(theStatute.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

