package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteIdentifierIterator theStatute = (StatuteIdentifierIterator)findAncestorWithClass(this, StatuteIdentifierIterator.class);
			pageContext.getOut().print(theStatute.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for identifier tag ");
		}
		return SKIP_BODY;
	}
}

